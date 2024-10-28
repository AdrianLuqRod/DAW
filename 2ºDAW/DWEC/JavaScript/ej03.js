function resul() {
    let iframe = document.getElementById('iframeCalculo');
    let iframeDocument = iframe.contentDocument;
    let base = iframeDocument.getElementById('base').value;
    let exponente =
        iframeDocument.getElementById('exponente').value;

    let resultado = Math.pow(base, exponente);
    document.getElementById('resulIframe').value = resultado;
}