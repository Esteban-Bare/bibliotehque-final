console.log("loaded");
let mesLivres;
let mesMembres;
let mesEmprunts;

fetch("http://localhost:8080/livres/all")
    .then(response => {
        if (!response.ok) {
            throw new Error("Error serveur");
        }
        return response.json();
    })
    .then(json => {
        mesLivres = json;
        console.log(mesLivres)
    })
    .catch(error => {
        console.error(error);
    });

fetch("http://localhost:8080/membre/all")
    .then(response => {
        if (!response.ok) {
            throw new Error("Error serveur");
        }
        return response.json();
    })
    .then(json => {
        mesMembres = json
        console.log(mesMembres)
    })
    .catch(error => {
        console.error(error);
    });


fetch("http://localhost:8080/emprunts/all")
    .then(response => {
        if (!response.ok) {
            throw new Error("Error serveur");
        }
        return response.json();
    })
    .then(json => {
        mesEmprunts = json
        console.log(mesEmprunts);
    })
    .catch(error => {
        console.error(error);
    });


    // console.log(new Date());
    // console.log(new Date(json[0].dateRetourPrevue));
    // console.log( Math.floor(((new Date()) - (new Date(json[0].dateRetourPrevue))) / (1000 * 60 * 60 * 24)));

const divContenu = document.getElementById("contenu");
document.getElementById("btnLivres").addEventListener("click", arg => {
    console.log("ici")
    for (let livre of mesLivres) {
        afficherLivre(livre);
    }
})
document.getElementById("btnMembres");
document.getElementById("btnEmprunts");

function afficherLivre(livre) {
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