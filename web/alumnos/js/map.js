$(window).on('load', function() {
    //Creo un nuevo mapa situado en Buenos Aires, Argentina, con 13 de Zoom y del tipo ROADMAP
    var mapa = new google.maps.Map(document.getElementById("mapa_google"),
            {
                center: new google.maps.LatLng(-12.06310679913050, -77.10323095321655),
                zoom: 15,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            });

    google.maps.event.addListener(mapa, 'click', function(coordenate) {
        var latitud = coordenate.latLng.lat();
        var longitud = coordenate.latLng.lng();
        var coordenada = new google.maps.LatLng(latitud, longitud);
        console.log(latitud);
        console.log(longitud);
        $('#coordenadas').html(latitud + "  " + longitud);
        //creo un marcador en esa position
        var marcador = new google.maps.Marker(
                {
                    position: coordenada,
                    map: mapa,
                    animation: google.maps.Animation.DROP,
                    draggable: true,
                    title: "Un nuevo Marcador"
                });

        //Evento al marcador creado cuando se termina de mover dragend
        google.maps.event.addListener(marcador, "dragend", function(evento) {
            var coordenadas = evento.latLng.lat() + ", " + evento.latLng.lng();
            alert(coordenadas);
        });

    });

});