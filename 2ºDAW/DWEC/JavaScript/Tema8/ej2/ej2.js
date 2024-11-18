document.addEventListener("keydown", function (event) {
    const box = document.getElementById("box");
    const step = 10;
    let top = parseInt(window.getComputedStyle(box).top);
    let left = parseInt(window.getComputedStyle(box).left);

    switch (event.key) {
        case "ArrowUp":
        case "8":
            box.style.top = top - step + "px";
            break;
        case "ArrowDown":
        case "2":
            box.style.top = top + step + "px";
            break;
        case "ArrowLeft":
        case "4":
            box.style.left = left - step + "px";
            break;
        case "ArrowRight":
        case "6":
            box.style.left = left + step + "px";
            break;
        case "7":
            box.style.top = top - step + "px";
            box.style.left = left - step + "px";
            break;
        case "9":
            box.style.top = top - step + "px";
            box.style.left = left + step + "px";
            break;
        case "1":
            box.style.top = top + step + "px";
            box.style.left = left - step + "px";
            break;
        case "3":
            box.style.top = top + step + "px";
            box.style.left = left + step + "px";
            break;
    }
});