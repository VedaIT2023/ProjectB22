var orgMovieList;

fetch('https://itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topMovies/json')
  .then(response => {
    if (!response.ok) {
      throw new Error(`Details not found. Status: ${response.status}`);
    }
    return response.json();
  })
  .then(result => {
    orgMovieList = result.feed.entry;
    movieList(orgMovieList);
  })
  .catch(error => {
    console.log(error);
  });

function srh() {
  

  var trend_container = document.getElementById('main-container');
  trend_container.style.display = 'none';

  var trend_main_container = document.getElementById('trending-container');
  trend_main_container.style.display = 'block';

  var trend_Content = document.getElementById('trend-content');
  trend_Content.style.display = 'block';
  
  var trend_heading = document.getElementById('trend-heading');
  trend_heading.style.display = 'none';

  var trend_content_Parent = document.getElementById('trend-container-box');
  trend_content_Parent.style.display = 'none';

  var trend_second_main_container = document.getElementById('trending-container-fantasy');
  trend_second_main_container.style.display = 'none';

  var trend_third_main_container = document.getElementById('trending-container-mystery');
  trend_third_main_container.style.display = 'none';

  var favBar = document.getElementById('favourite_Container_Box');
  favBar.style.display = 'none';

  var searchInput = document.getElementById('search').value.toLowerCase();

  if(searchInput!==''){

  var filteredMovies = orgMovieList.filter(movie =>

    movie["im:name"].label.toLowerCase().startsWith(searchInput)

  );

  }

  movieList(filteredMovies);
}

function movieList(entry) {
  var trendContent = document.getElementById('trend-content');
  trendContent.innerHTML = '';

  var favBar = document.getElementById('favourite_Container_Box');
  favBar.style.display = 'none';

  for (var i = 0; i < entry.length; i++) {
    let movie = entry[i];

    var trendContentParent = document.createElement('div');
    trendContentParent.className = 'trend-box';

    var trendImg = document.createElement('img');
    trendImg.src = movie["im:image"][2].label;
    trendImg.alt = movie["im:name"].label + ' img';
    trendImg.className = 'trend-img';

    var trendText = document.createElement('div');
    trendText.className = 'trend-text';

    var trendTitle = document.createElement('h2');
    trendTitle.textContent = movie["im:name"].label;
    trendTitle.className = 'trend-title';

    var trendPrice = document.createElement('p');
    trendPrice.className = 'trend-price';
    trendPrice.innerHTML = '<strong>Price</strong> ' + movie["im:price"].label;

    var trendBtn = document.createElement('a');
    trendBtn.href = movie["link"][1].attributes.href;
    trendBtn.className = 'trend-btn';

    var playIcon = document.createElement('i');
    playIcon.className = 'fa-solid fa-play';

    var buttonText = document.createElement('span');
    buttonText.textContent = 'Watch Now';

    trendBtn.appendChild(playIcon);
    trendBtn.appendChild(buttonText);

    trendText.appendChild(trendTitle);
    trendText.appendChild(trendPrice);
    trendText.appendChild(trendBtn);

    trendContentParent.appendChild(trendImg);
    trendContentParent.appendChild(trendText);

    trendContent.appendChild(trendContentParent);

    var firsttrendContentParent = document.getElementById('trend-container-box');

    trendImg.addEventListener('click', () => {
      var movieListContent = document.getElementById('trend-content');
      movieListContent.style.display = 'none';

      var trend_container = document.getElementById('main-container');
      trend_container.style.display = 'none';

      var trend_main_container = document.getElementById('trending-container');
      trend_main_container.style.display = 'none';

      var trend_second_main_container = document.getElementById('trending-container-fantasy');
      trend_second_main_container.style.display = 'none';

      var trend_third_main_container = document.getElementById('trending-container-mystery');
      trend_third_main_container.style.display = 'none';

      var favBar = document.getElementById('favourite_Container_Box');
      favBar.style.display = 'none';

      var trend_content_Parent = document.getElementById('trend-container-box');
      trend_content_Parent.style.display = 'block';

      var secondTrendContentChild = document.createElement('div');
      secondTrendContentChild.className = 'trend_child';

      var trend_Img = document.createElement('img');
      trend_Img.src = movie["im:image"][2].label;
      trend_Img.alt = movie["im:name"].label + ' img';
      trend_Img.className = 'trend_img';

      var trend_text_box = document.createElement('div');
      trend_text_box.className = 'text_box';

      var trend_name = document.createElement('h2');
      trend_name.textContent = movie["im:name"].label;
      trend_name.className = 'trend_title';

      var trend_summary = document.createElement('p');
      trend_summary.textContent = movie["summary"].label;
      trend_summary.className = 'trend_Summary';

      var trend_price_second = document.createElement('p');
      trend_price_second.className = 'trend_price';
      trend_price_second.innerHTML = '<strong>Price</strong> ' + movie["im:price"].label;

      var trend_rights = document.createElement('p');
      trend_rights.textContent = movie["rights"].label;
      trend_rights.className = 'trend_rights';

      var trend_link = document.createElement('a');
      trend_link.href = movie["link"][1].attributes.href;
      trend_link.textContent = 'Watch Now';
      trend_link.className = 'trend_link';

      var trend_category = document.createElement('p');
      trend_category.textContent = 'Category: ' + movie["category"].attributes.term;
      trend_category.className = 'trend_category';

      var trend_releaseDate = document.createElement('p');
      trend_releaseDate.textContent = 'Release Date: ' + movie["im:releaseDate"].label;
      trend_releaseDate.className = 'trend_releaseDate';

      var addToFavoritesBtn = document.createElement('button');
      addToFavoritesBtn.textContent = 'Add to Favorites ❤️';
      addToFavoritesBtn.className = 'add-to-favorites-btn';

      addToFavoritesBtn.addEventListener('click', function() {

      favourites(movie);
        
      });

      trend_text_box.appendChild(trend_name);
      trend_text_box.appendChild(trend_summary);
      trend_text_box.appendChild(trend_price_second);
      trend_text_box.appendChild(trend_category);
      trend_text_box.appendChild(trend_releaseDate);
      trend_text_box.appendChild(trend_rights);
      trend_text_box.appendChild(addToFavoritesBtn);
      trend_text_box.appendChild(trend_link);

      secondTrendContentChild.appendChild(trend_Img);
      secondTrendContentChild.appendChild(trend_text_box);

      firsttrendContentParent.appendChild(secondTrendContentChild);
    });
  }
}

function favourites(movie){
  var movieListContent = document.getElementById('trend-content');
      movieListContent.style.display = 'none';

      var trend_container = document.getElementById('main-container');
      trend_container.style.display = 'none';

      var trend_main_container = document.getElementById('trending-container');
      trend_main_container.style.display = 'none';

      var trend_second_main_container = document.getElementById('trending-container-fantasy');
      trend_second_main_container.style.display = 'none';

      var trend_third_main_container = document.getElementById('trending-container-mystery');
      trend_third_main_container.style.display = 'none';

      var trend_content_Parent = document.getElementById('trend-container-box');
      trend_content_Parent.style.display = 'none';

      var favBar = document.getElementById('favourite_Container_Box');
      favBar.style.display = 'block';

      var fav_Container = document.createElement('div');
      fav_Container.className = 'fav-Container';

      var favImg = document.createElement('img');
      favImg.src = movie["im:image"][2].label;
      favImg.alt = movie["im:name"].label + ' img';
      favImg.className = 'fav-img';

      var fav_Container_Child = document.createElement('div');
      fav_Container_Child.className = 'fav-Child';

      var fav_Title = document.createElement('h2');
      fav_Title.textContent = movie["im:name"].label;
      fav_Title.className = 'fav_title';

      var fav_link = document.createElement('a');
      fav_link.href = movie["link"][1].attributes.href;
      fav_link.textContent = 'Watch Now';
      fav_link.className = 'fav_link';
      
      fav_Container_Child.appendChild(fav_Title);
      fav_Container_Child.appendChild(fav_link);

      fav_Container.appendChild(favImg);
      fav_Container.appendChild(fav_Container_Child);

      favBar.appendChild(fav_Container);




}


/*
function addToFavorites(movie) {
  if (!favorites.some(fav => fav.id === movie.id)) {
    favorites.push(movie);
    localStorage.setItem('favorites', JSON.stringify(favorites));
  } else {
    console.log('Movie already in favorites');
  }
}

function showFavorites() {
  var storedFavorites = JSON.parse(localStorage.getItem('favorites')) || [];
  console.log('Favorites:', storedFavorites);

}

function favourites() {
  showFavorites();
}

document.querySelector('.nav-home #Favourites').addEventListener('click', favourites);
*/

