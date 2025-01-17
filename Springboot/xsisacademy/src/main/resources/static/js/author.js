const BASE_URL = "http://localhost:8181/api/author";

// Membuka form untuk tambah data
function openForm() {
    $('#id').val('');
    $('#name').val('');
    $('#modalForm').modal('show');
}

// Mengisi form untuk edit data
function editForm(id) {
    $.ajax({
        type: "GET",
        url: `${BASE_URL}/${id}`,
        success: function (response) {
            let author = response.data;
            $('#id').val(author.id);
            $('#name').val(author.name);
            $('#publishedBooks').val(author.publishedBooks);
            $('#modalForm').modal('show');
            $('.modal-title').html('Publisher Form');
//            $('.modal-body').html(response);
        }
    });
}

// Menyimpan (tambah/update) data
function saveAuthor() {
    let id = $('#id').val();
    let name = $('#name').val();
    let publishedBooks = $('#publishedBooks').val();
    let method = id ? "PUT" : "POST";
    let url = id ? `${BASE_URL}/${id}` : BASE_URL;

    $.ajax({
        type: method,
        url: url,
        contentType: "application/json",
        data: JSON.stringify({ id, name, publishedBooks }),
        success: function () {
            $('#modalForm').modal('hide');
            location.reload();
        }
    });
}

// Menghapus data
function deleteAuthor(id) {
    $.ajax({
        type: "DELETE",
        url: `${BASE_URL}/${id}`,
        success: function (response) {
            location.reload();
        }
    });
}

