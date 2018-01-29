    function onGetResult() {

        var result = document.getElementById("result");
        var spinner = document.getElementById("spinner");
        var special = document.getElementById("specialNumber");
        result.innerHTML = '';
        if (special.value.length != 0) {
            spinner.style.visibility = 'visible';
            setTimeout(function() {
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function() {

                    if (xhttp.readyState == 4 && xhttp.status == 200) {
                        spinner.style.visibility = 'hidden';
                        result.innerHTML = "Speciality of number " + special.value + ":<br>" + xhttp.responseText;
                    }
                    if (xhttp.readyState == 4 && xhttp.status == 404) {
                        spinner.style.visibility = 'hidden';
                        result.innerHTML = xhttp.responseText;
                    }
                };

                xhttp.open("GET", "http://numbersapi.com/" + special.value, true);
                xhttp.send();
            }, 2000);

        }

    }

    function onDisplay() {
        document.getElementById("sectionId").innerHTML = "Hello there!";
    }
