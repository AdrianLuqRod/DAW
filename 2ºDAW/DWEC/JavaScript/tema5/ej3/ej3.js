let calcularPotencia = () => {
    let base = Number(window.parent.document.getElementById("base").value);
    let exponente = Number(window.parent.document.getElementById("exponente").value);
    let resultado = Math.pow(base, exponente);
    document.getElementById("resulIframe").value = resultado;
}