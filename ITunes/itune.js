
var search_text = document.getElementById('search_text')

var autocomplete_container = document.getElementById('autocomplete-container');

var home_text = document.getElementById('home_text');

var main_menulogo = document.getElementById('main_menulogo')

var audio_song = document.getElementById('audio_song');

var get_started_conatiner = document.getElementById('get_started_conatiner');

var click_song = document.getElementById('click_song')

var get_started_second = document.getElementById('get_started_second');

var searchInput = document.getElementById('searchInput');


function home_bar() {

    home_text.style.display = 'block'

    get_started_conatiner.innerHTML = ''
    get_started_second.innerHTML = ''

    autocomplete_container.style.display = 'none'
    search_text.style.display = 'none'
    get_started_second.style.display = 'none'
    get_started_conatiner.style.display = 'none'
    click_song.style.display = 'none';


}


function search_bar() {


    get_started_conatiner.innerHTML = ''
    get_started_second.innerHTML = ''
    searchInput.innerHTML = ''

    autocomplete_container.style.display = 'block'
    search_text.style.display = 'block'
    home_text.style.display = 'none'
    get_started_conatiner.style.display = 'none'

    get_started_second.style.display = 'none'
    click_song.style.display = 'none';


}




function get_started() {

    get_started_conatiner.innerHTML = ''
    get_started_second.innerHTML = ''


    autocomplete_container.style.display = 'none'
    search_text.style.display = 'none'
    home_text.style.display = 'none'
    get_started_conatiner.style.display = 'grid'
    loop(songs);
    click_song.style.display = 'none';





}

function all_songs() {

    get_started_second.innerHTML = ''
    get_started_conatiner.innerHTML = ''

    home_text.style.display = 'none'
    autocomplete_container.style.display = 'none'
    search_text.style.display = 'none'
    get_started_second.style.display = 'none'


    get_started_conatiner.style.display = 'grid'
    loop(songs);
    click_song.style.display = 'none';



}

var songs;

fetch('http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topsongs/limit=110/json')
    .then(response => {
        if (!response.ok) {
            throw new Error('Details not found');
        }

        return response.json()
    })
    .then(result => {
        songs = (result.feed.entry)
    })
    .catch(error => {
        console.log(error)
    })




function loop() {


    for (let index = 0; index < songs.length; index++) {

        var get_started_conatiner = document.getElementById('get_started_conatiner');

        var get_started1 = document.createElement('div');
        get_started1.className = 'get_started1';
        get_started1.id = 'get_started1';



        var image_cover = document.createElement('img');
        image_cover.src = songs[index]['im:image'][2].label;
        image_cover.alt = 'Loading image';


        get_started1.appendChild(image_cover);

        var album_text = document.createElement('div');
        album_text.className = 'album_text';

        var song_name = document.createElement('p');
        song_name.innerHTML = "Song: " + songs[index]['im:name'].label;

        var song_artist = document.createElement('p');
        song_artist.innerHTML = "Artist: " + songs[index]['im:artist'].label;

        album_text.appendChild(song_name);
        album_text.appendChild(song_artist);

        get_started1.appendChild(album_text);



        get_started_conatiner.appendChild(get_started1);
        get_started1.onclick = function () {
            var click_song = document.getElementById('click_song');
            var audio_song = document.getElementById('audio_song');
            click_song.innerHTML = '';
            audio_song.innerHTML = '';

            var audio_play = document.createElement('audio');
            audio_play.src = songs[index]['link'][1]['attributes'].href;
            audio_play.controls = true;
            audio_play.autoplay = true;

            audio_play.id = 'dynamic_audio_element';

            audio_song.appendChild(audio_play);

            audio_song.style.display = 'block';
            click_song.style.display = 'block';

            main_menulogo.classList.add("blurred");
            get_started_conatiner.style.display = 'none';
            main_menulogo.classList.remove("no_blurred");
            click_song.style.display = 'block';

            var image1 = document.createElement('img');
            image1.src = songs[index]['im:image'][2].label;

            var click_song_text = document.createElement('div');

            var songname = document.createElement('p');
            songname.innerHTML = "Song: " + songs[index]['im:name'].label;

            var songartist = document.createElement('p');
            songartist.innerHTML = "Artist: " + songs[index]['im:artist'].label;

            var songcategory = document.createElement('p');
            songcategory.innerHTML = "Category: " + songs[index]['category']['attributes'].label;

            var songprice = document.createElement('p');
            songprice.innerHTML = "Price: " + songs[index]['im:price'].label;

            var songrights = document.createElement('p');
            songrights.innerHTML = "Rights: ";

            var songrelease = document.createElement('p');
            songrelease.innerHTML = "Release Date: " + songs[index]['im:releaseDate']['attributes'].label;

            click_song_text.appendChild(songname);
            click_song_text.appendChild(songartist);
            click_song_text.appendChild(songcategory);
            click_song_text.appendChild(songprice);
            click_song_text.appendChild(songrights);
            click_song_text.appendChild(songrelease);

            click_song.appendChild(click_song_text);
            click_song.appendChild(image1);

            image1.onclick = function () {
                var url = songs[index]['im:collection']['link']['attributes'].href;
                window.open(url, '_self');
            };


        }

    }
}

document.getElementById('search_button').addEventListener('click', performSearch);
document.getElementById('searchInput').addEventListener('keydown', function (event) {
    if (event.key === 'Enter') {
        performSearch();
    }
});

function performSearch() {
    const searchQuery = document.getElementById('searchInput').value.trim();
    if (searchQuery !== '') {

    var get_started_second = document.getElementById('get_started_second');
    get_started_second.innerHTML = '';
    let count = 0;
    autocomplete_container.style.display = 'none';
    search_text.style.display = 'none';
    get_started_second.style.display = 'grid'
    for (let index = 0; index < songs.length; index++) {

        if (songs[index]['im:name'].label.replace(/\s/g, '').toLowerCase().startsWith(searchQuery.replace(/\s/g, '').toLowerCase())) {

            var get_second = document.createElement('div');
            get_second.className = 'get_second';
            get_second.id = 'get_second';

            var image_cover = document.createElement('img');
            image_cover.src = songs[index]['im:image'][2].label;
            image_cover.alt = 'Loading image';
            get_second.appendChild(image_cover);

            var album_second = document.createElement('div');
            album_second.className = 'album_second';

            var song_name = document.createElement('p');
            song_name.innerHTML = "Song: " + songs[index]['im:name'].label;

            var song_artist = document.createElement('p');
            song_artist.innerHTML = "Artist: " + songs[index]['im:artist'].label;

            album_second.appendChild(song_name);
            album_second.appendChild(song_artist);

            get_second.appendChild(album_second);

            get_started_second.appendChild(get_second);

            get_second.onclick = function () {


                var click_song = document.getElementById('click_song');
                var audio_song = document.getElementById('audio_song');
                click_song.innerHTML = '';
                audio_song.innerHTML = '';

                var audio_play = document.createElement('audio');
                audio_play.src = songs[index]['link'][1]['attributes'].href;
                audio_play.controls = true;
                audio_play.autoplay = true;

                audio_play.id = 'dynamic_audio_element';

                audio_song.appendChild(audio_play);
                get_started_conatiner.style.display = 'none';
                get_started_second.style.display = 'none'


                audio_song.style.display = 'block';
                click_song.style.display = 'block';

                main_menulogo.classList.add("blurred");
                main_menulogo.classList.remove("no_blurred");
                click_song.style.display = 'block';

                var image1 = document.createElement('img');
                image1.src = songs[index]['im:image'][2].label;

                var click_song_text = document.createElement('div');

                var songname = document.createElement('p');
                songname.innerHTML = "Song: " + songs[index]['im:name'].label;

                var songartist = document.createElement('p');
                songartist.innerHTML = "Artist: " + songs[index]['im:artist'].label;

                var songcategory = document.createElement('p');
                songcategory.innerHTML = "Category: " + songs[index]['category']['attributes'].label;

                var songprice = document.createElement('p');
                songprice.innerHTML = "Price: " + songs[index]['im:price'].label;

                var songrights = document.createElement('p');
                songrights.innerHTML = "Rights: ";

                var songrelease = document.createElement('p');
                songrelease.innerHTML = "Release Date: " + songs[index]['im:releaseDate']['attributes'].label;

                click_song_text.appendChild(songname);
                click_song_text.appendChild(songartist);
                click_song_text.appendChild(songcategory);
                click_song_text.appendChild(songprice);
                click_song_text.appendChild(songrights);
                click_song_text.appendChild(songrelease);

                click_song.appendChild(click_song_text);
                click_song.appendChild(image1);

                image1.onclick = function () {
                    var url = songs[index]['im:collection']['link']['attributes'].href;
                    window.open(url, '_self');
                };


            }

            count++;

        }

    }
    if (count == 0) {
        alert("Sorry, this song is unavailable.");
        get_started_second.style.display = 'none'
        autocomplete_container.style.display = 'block';
        search_text.style.display = 'block';
    }


    } else {
        alert('Please enter a search query.');
    }
}


document.getElementById('searchInput').addEventListener('input', function () {
    const searchInput = this.value.toLowerCase();
    const autocompleteList = document.getElementById('autocomplete-list');

    autocompleteList.innerHTML = '';

    if (!searchInput) {
        autocompleteList.style.display = 'none';
        return;
    }

    const matchingSongs = songs.filter(song => song['im:name'].label.toLowerCase().startsWith(searchInput));

    matchingSongs.forEach(song => {
        const autocompleteItem = document.createElement('div');
        autocompleteItem.className = 'autocomplete-item';
        autocompleteItem.textContent = song['im:name'].label;

        autocompleteItem.addEventListener('click', function () {

            if(document.getElementById('searchInput').value = song['im:name'].label){
            autocompleteList.style.display = 'none';

            autocomplete_container.style.display = 'none';
            search_text.style.display = 'none';

            var get_started_second = document.getElementById('get_started_second');
            get_started_second.innerHTML = '';

            get_started_second.style.display = 'grid'

            var get_second = document.createElement('div');
            get_second.className = 'get_second';
            get_second.id = 'get_second';

            var image_cover = document.createElement('img');
            image_cover.src = song['im:image'][2].label;
            image_cover.alt = 'Loading image';
            get_second.appendChild(image_cover);

            var album_second = document.createElement('div');
            album_second.className = 'album_second';

            var song_name = document.createElement('p');
            song_name.innerHTML = "Song: " + song['im:name'].label;

            var song_artist = document.createElement('p');
            song_artist.innerHTML = "Artist: " + song['im:artist'].label;

            album_second.appendChild(song_name);
            album_second.appendChild(song_artist);

            get_second.appendChild(album_second);

            get_started_second.appendChild(get_second);

            get_second.onclick = function () {


                var click_song = document.getElementById('click_song');
                var audio_song = document.getElementById('audio_song');
                click_song.innerHTML = '';
                audio_song.innerHTML = '';

                var audio_play = document.createElement('audio');
                audio_play.src = song['link'][1]['attributes'].href;
                audio_play.controls = true;
                audio_play.autoplay = true;

                audio_play.id = 'dynamic_audio_element';

                audio_song.appendChild(audio_play);
                get_started_second.style.display = 'none'

                get_started_conatiner.style.display = 'none';

                audio_song.style.display = 'block';
                click_song.style.display = 'block';

                main_menulogo.classList.add("blurred");
                main_menulogo.classList.remove("no_blurred");
                click_song.style.display = 'block';

                var image1 = document.createElement('img');
                image1.src = song['im:image'][2].label;

                var click_song_text = document.createElement('div');

                var songname = document.createElement('p');
                songname.innerHTML = "Song: " + song['im:name'].label;

                var songartist = document.createElement('p');
                songartist.innerHTML = "Artist: " + song['im:artist'].label;

                var songcategory = document.createElement('p');
                songcategory.innerHTML = "Category: " + song['category']['attributes'].label;

                var songprice = document.createElement('p');
                songprice.innerHTML = "Price: " + song['im:price'].label;

                var songrights = document.createElement('p');
                songrights.innerHTML = "Rights: ";

                var songrelease = document.createElement('p');
                songrelease.innerHTML = "Release Date: " + song['im:releaseDate']['attributes'].label;

                click_song_text.appendChild(songname);
                click_song_text.appendChild(songartist);
                click_song_text.appendChild(songcategory);
                click_song_text.appendChild(songprice);
                click_song_text.appendChild(songrights);
                click_song_text.appendChild(songrelease);

                click_song.appendChild(click_song_text);
                click_song.appendChild(image1);

                image1.onclick = function () {
                    var url = song['im:collection']['link']['attributes'].href;
                    window.open(url, '_self');
                };

            }
        }else {

            performSearch();

        }

        });

        autocompleteList.appendChild(autocompleteItem);
    });

    if (matchingSongs.length > 0) {
        autocompleteList.style.display = 'block';
    } else {
        autocompleteList.style.display = 'none';
    }
});

document.addEventListener('click', function (event) {
    const autocompleteList = document.getElementById('autocomplete-list');

    if (!event.target.closest('.autocomplete-container')) {
        autocompleteList.style.display = 'none';
    }
});






document.addEventListener("DOMContentLoaded", function() {
    const containers = document.querySelectorAll(".inner_category_container");

    containers.forEach(function(container) {
        let currentScrollPosition = 0;
        let scrollAmount = 320;
        const sCont = container.querySelector(".content_container");
        const btnScrollLeft = container.querySelector(".btn_scroll_left");
        const btnScrollRight = container.querySelector(".btn_scroll_right");

        btnScrollLeft.style.opacity = "0";

        let maxScroll = -sCont.offsetWidth + container.offsetWidth;

        btnScrollLeft.addEventListener("click", function() {
            currentScrollPosition += scrollAmount;

            if (currentScrollPosition > 0) {
                currentScrollPosition = 0;
                btnScrollLeft.style.opacity = "0";
            } else {
                btnScrollLeft.style.opacity = "1";
            }

            if (currentScrollPosition <= maxScroll) {
                currentScrollPosition = maxScroll;
                btnScrollRight.style.opacity = "0";
            } else {
                btnScrollRight.style.opacity = "1";
            }

            sCont.style.left = currentScrollPosition + "px";
        });

        btnScrollRight.addEventListener("click", function() {
            currentScrollPosition -= scrollAmount;

            if (currentScrollPosition > 0) {
                currentScrollPosition = 0;
                btnScrollLeft.style.opacity = "0";
            } else {
                btnScrollLeft.style.opacity = "1";
            }

            if (currentScrollPosition <= maxScroll) {
                currentScrollPosition = maxScroll;
                btnScrollRight.style.opacity = "0";
            } else {
                btnScrollRight.style.opacity = "1";
            }

            sCont.style.left = currentScrollPosition + "px";
        });
    });
});

