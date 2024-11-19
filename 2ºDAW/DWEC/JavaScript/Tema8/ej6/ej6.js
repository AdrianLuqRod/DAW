document.addEventListener("DOMContentLoaded", function () {
  const img1 = document.getElementById("img1");
  const srcOriginal = img1.src;
  const nuevoSrc =
    "https://imgs.search.brave.com/K7E8r_toM4fq21NuM38ahQ3cUfq6wofHo35Y5JmgD4U/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly8xMDAw/bWFyY2FzLm5ldC93/cC1jb250ZW50L3Vw/bG9hZHMvMjAyMC8x/MS9KYXZhLWxvZ28t/NjAweDMzNC5qcGc";

  img1.addEventListener("mousedown", function () {
    img1.src = nuevoSrc;
  });

  img1.addEventListener("mouseup", function () {
    img1.src = srcOriginal;
  });

  img1.addEventListener("mouseleave", function () {
    img1.src = srcOriginal;
  });
});
