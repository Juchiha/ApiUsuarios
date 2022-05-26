// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
    $('#usuarios').DataTable();

    $("#usuarios tbody:")
});

async function cargarUsuarios(){
    const request = await fetch('api/usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const usuarios = await request.json();

    let usuarioHtml = '';
    for(let usuario of usuarios){
        usuarioHtml += '<tr>';
        usuarioHtml += '<td>'+usuario.id+'</td>';
        usuarioHtml += '<td>'+usuario.nombre+' '+usuario.apellido+'</td>';
        usuarioHtml += '<td>'+usuario.email+'</td>';
        usuarioHtml += '<td>'+usuario.telefono+'</td>';
        usuarioHtml += '<td style="text-align:center;">'
        usuarioHtml += '<a href="#" class="btn btn-danger btn-circle btn-sm eliminarUsuario" onclick="javascript:eliminarUsuario('+usuario.id+')">';
        usuarioHtml += '<i class="fas fa-trash"></i>';
        usuarioHtml += '</a>';
        /*usuarioHtml += '<a href="#" class="btn btn-success btn-circle btn-sm">';
        usuarioHtml += '<i class="fas fa-edit"></i>';
        usuarioHtml += '</a>';*/
        usuarioHtml += '</td>';
        usuarioHtml += '</tr>';
    }
    document.querySelector("#usuarios tbody").outerHTML = usuarioHtml;
}

async function eliminarUsuario(id) {
    if(confirm("Desea Eliminar este Usuario")){
        const request = await fetch('api/eliminarUsuario/'+id, {
          method: 'DELETE',
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          }
        });
        cargarUsuarios();
    }
}