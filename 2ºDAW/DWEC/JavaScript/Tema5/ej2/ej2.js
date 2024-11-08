let generarNumero = () => {
  let numeroAleatorio = Math.floor(Math.random() * 3);
  let sitios = ["https://yahoo.com", "https://gmail.com", "hotmail.com"];
  window.location.href = sitios[numeroAleatorio];
};
