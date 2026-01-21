console.log("loaded");
const divContenu = document.getElementById("contenu");
const buttonLivres = document.getElementById("livres");
const buttonMembres = document.getElementById("membres")
let mesLivres;

buttonLivres.addEventListener("click" , event => {
    fetch("http://localhost:8080/livres/all")
    .then(response => {
        if (!response.ok) {
            throw new Error("Error serveur");
        }
        return response.json();
    })
    .then(json => {
        mesLivres = json;
        if (divContenu.textContent != "") {
        divContenu.textContent = ""
        }
        for (let livre of json) {
            afficherLivres(livre);
        }
    })
    .catch(error => {
        console.error(error);
    });
})

buttonMembres.addEventListener("click" , event => {
    fetch("http://localhost:8080/membre/all")
    .then(response => {
        if (!response.ok) {
            throw new Error("Error serveur");
        }
        return response.json();
    })
    .then(json => {
        if (divContenu.textContent != "") {
        divContenu.textContent = ""
        }
        for (let membre of json) {
            afficherMembre(membre);
        }
    })
    .catch(error => {
        console.error(error);
    });
})



function afficherLivres(livre) {
    const livreElement = document.createElement("div")
    const titreP = document.createElement("p")
    titreP.textContent = livre.titre;
    const isbnP = document.createElement("p")
    isbnP.classList.add("titre")
    isbnP.textContent = livre.isbn;
    livreElement.appendChild(isbnP);
    livreElement.appendChild(titreP);
    divContenu.appendChild(livreElement);
}

function afficherMembre(membre) {
    const membreElement = document.createElement("div")
    const prenomP = document.createElement("p")
    prenomP.textContent = membre.prenom;
    membreElement.appendChild(prenomP);
    divContenu.appendChild(membreElement);
}