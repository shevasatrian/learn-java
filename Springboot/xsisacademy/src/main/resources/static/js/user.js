function openForm() {
    $.ajax({
        type: "get",
        url: "/user/form",
        contentType: "html",
        success: function (userForm) {
            $('#modalForm').modal('show');
            $('.modal-title').html('User Form');
            $('.modal-body').html(userForm);
        }
    });
}

function editForm(id) {
    $.ajax({
        type: "get",
        url: `/user/edit/${id}`,
        contentType: "html",
        success: function (userForm) {
            $('#modalForm').modal('show');
            $('.modal-title').html('User Form');
            $('.modal-body').html(userForm);
        }
    });
}

function deleteUser (id) {
    // confirm("Are you sure?", 
    //     $.ajax({
    //         type: "delete",
    //         url: `/user/delete/${id}`,
    //         dataType: "html",
    //         success: function (response) {
    //             location.reload()
    //         }
    //     })
    // );
    $.ajax({
        type: "get",
        url: `/user/delete/${id}`,
        dataType: "html",
        success: function (response) {
            location.reload()
        }
    })
}