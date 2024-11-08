let irSitioAleatorio = () => {
    let sitios = [
        "https://yahoo.com",
        "https://gmail.com",
        "https://hotmail.com",
    ]

    let sitioAleatorio = sitios[Math.floor(Math.random() * sitios.length)];
    window.location.href = sitioAleatorio;
}