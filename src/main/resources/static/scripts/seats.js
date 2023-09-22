document.addEventListener("DOMContentLoaded", function(){
fetch('http://localhost:8080/api/hall/1')
.then(res => res.json())
.then(data => {
const seats = document.getElementById("see");
data.forEach(halls => {
const hallDiv = document.createElement("div");
hallDiv.innerHTML = `<h3> ${halls.name}</h3> <ul> <li> ${halls.seats} </li></ul>`
hallAndSeats.appendChild(hallDiv);

})
}.catch(error => {
             console.error('Error fetching data:', error);

})


})