document.addEventListener('mousedown', function (event) {
    switch (event.button) {
        case 0:
            alert('Has pulsado el botón izquierdo del ratón.');
            break;
        case 1:
            alert('Has pulsado la rueda central del ratón.');
            break;
        case 2:
            alert('Has pulsado el botón derecho del ratón.');
            break;
        default:
            alert('Has pulsado un botón desconocido.');
    }
});