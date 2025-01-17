const BASE_URL = "http://localhost:8181/api/publisher";

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
            let publisher = response.data;
            $('#id').val(publisher.id);
            $('#name').val(publisher.name);
            $('#address').val(publisher.address);
            $('#modalForm').modal('show');
            $('.modal-title').html('Publisher Form');
//            $('.modal-body').html(response);
        }
    });
}

// Menyimpan (tambah/update) data
function savePublisher() {
    let id = $('#id').val();
    let name = $('#name').val();
    let address = $('#address').val();
    let method = id ? "PUT" : "POST";
    let url = id ? `${BASE_URL}/${id}` : BASE_URL;

    $.ajax({
        type: method,
        url: url,
        contentType: "application/json",
        data: JSON.stringify({ id, name, address }),
        success: function () {
            $('#modalForm').modal('hide');
            location.reload();
        }
    });
}

// Menghapus data
function deletePublisher(id) {
    $.ajax({
        type: "DELETE",
        url: `${BASE_URL}/${id}`,
        success: function (response) {
            location.reload();
        }
    });
}

