var grecaptcha;

const Sigup = {
    username: "",
    password: "",
    email: ""
};

function savedetail() {
    const recaptchaResponse = grecaptcha.getResponse();

    if (recaptchaResponse.length === 0) {
        alert("Please complete the reCAPTCHA");
        return;
    }

    Sigup.username = document.getElementById("username").value;
    Sigup.password = document.getElementById("password").value;
    Sigup.email = document.getElementById("email").value;

    fetch("http://localhost:8080/Candidate", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(Sigup)
    })
        .then(response => {
            if (!response.ok) throw new Error("Request failed: " + response.status);
            return response.text();
        })
        .then(data => {
            console.log(data);
            alert("Form submitted successfully!");
        })
        .catch(error => {
            console.error("ERROR",error);
            alert(error.message);
        });
}

document.getElementById("abdus").addEventListener("click", savedetail);