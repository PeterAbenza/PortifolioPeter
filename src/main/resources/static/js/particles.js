particlesJS("particles-js", {
  "particles": {
    "links": {
      "enable": true,
      "distance": 100,
      "opacity": 0.5
    },
    "number": {
      "density": {
        "enable": true,
        "value_area": 800
      },
      "value": 55
    },
    "size": {
      "value": 3
    },
    "move": {
      "direction": "none",
      "enable": true,
      "out_mode": "bounce",
      "random": false,
      "speed": 5,
      "straight": false
    },
    "opacity": {
      "value": 0.5
    }
  },
  "interactivity": {
    "detect_on": "canvas",
    "events": {
      "onhover": {
        "enable": false // Desativar a interação ao passar o mouse
      },
      "onclick": {
        "enable": true,
        "mode": "push"
      },
      "resize": true
    },
    "modes": {
      "grab": {
        "distance": 400,
        "line_linked": {
          "opacity": 1
        }
      },
      "bubble": {
        "distance": 400,
        "size": 40,
        "duration": 2,
        "opacity": 8,
        "speed": 3
      },
      "repulse": {
        "distance": 200,
        "duration": 0.4
      },
      "push": {
        "particles_nb": 4
      },
      "remove": {
        "particles_nb": 2
      }
    }
  },
  "retina_detect": true
});
