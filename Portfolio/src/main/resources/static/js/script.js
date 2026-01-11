/* =========================
/* =========================
   TYPING TEXT ANIMATION
========================= */
const typingElement = document.querySelector(".typing");

if (typingElement) {
    const texts = [
        "Java Developer",
        "Spring Boot Developer",
        "Web Developer",
        "UI/UX Designer"
    ];

    let textIndex = 0;
    let charIndex = 0;
    let isDeleting = false;

    function typeEffect() {
        const currentText = texts[textIndex];

        if (!isDeleting) {
            typingElement.textContent = currentText.substring(0, charIndex++);
            if (charIndex > currentText.length) {
                setTimeout(() => isDeleting = true, 1200);
            }
        } else {
            typingElement.textContent = currentText.substring(0, charIndex--);
            if (charIndex === 0) {
                isDeleting = false;
                textIndex = (textIndex + 1) % texts.length;
            }
        }

        setTimeout(typeEffect, isDeleting ? 80 : 120);
    }

    typeEffect();
}

/* =========================
   BACKGROUND SLIDESHOW
========================= */
const slides = document.querySelectorAll(".slide");
let slideIndex = 0;

function showSlides() {
    slides.forEach(slide => slide.classList.remove("active"));
    slideIndex = (slideIndex + 1) % slides.length;
    slides[slideIndex].classList.add("active");
}

if (slides.length > 0) {
    setInterval(showSlides, 5000);
}


/* =========================
   ACTIVE NAVBAR LINK
========================= */

const navLinks = document.querySelectorAll(".nav-link a");

window.addEventListener("scroll", () => {
    let fromTop = window.scrollY + 80;

    navLinks.forEach(link => {
        let section = document.querySelector(link.getAttribute("href"));
        if (
            section &&
            section.offsetTop <= fromTop &&
            section.offsetTop + section.offsetHeight > fromTop
        ) {
            link.classList.add("active");
        } else {
            link.classList.remove("active");
        }
    });
});

/* =========================
   CARD HOVER ANIMATION
========================= */

document.querySelectorAll(".edu-card, .project-card").forEach(card => {
    card.addEventListener("mouseenter", () => {
        card.style.transform = "translateY(-6px)";
    });
    card.addEventListener("mouseleave", () => {
        card.style.transform = "translateY(0)";
    });
});