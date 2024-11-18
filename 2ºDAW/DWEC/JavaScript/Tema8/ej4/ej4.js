document.addEventListener("DOMContentLoaded", function () {
    const images = document.querySelectorAll("img");
    images.forEach((img) => {
        img.addEventListener("mouseover", function () {
            alert(this.src);
        });
    });
});