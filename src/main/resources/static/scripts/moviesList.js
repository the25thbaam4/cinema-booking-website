
document.addEventListener("DOMContentLoaded", function () {
    console.log("DOM content loaded");
    fetch('http://localhost:8080/api/movie')
        .then(response => response.json())
        .then(data => {
            console.log("Data received:", data);
            const movieList = document.getElementById('movieList');
            data.forEach(movie => {
                const movieDiv = document.createElement('div');
                movieDiv.innerHTML = `<h3>${movie.name}</h3><p>${movie.yearOfRelease}</p>`;
                movieList.appendChild(movieDiv);
            });
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
});
