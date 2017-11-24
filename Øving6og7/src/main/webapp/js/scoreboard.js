$(document).ready(function () {
    var url = 'http://localhost:8080/exercise6and7/rest/quizes/player';

    $.getJSON(url, function (data) {
        var i, table, row, cell1, cell2, cell3, playerName, playerPoints;
        table = document.getElementById("searchTable");

        for (i = 0; i < data.length; i++) {
            row = table.insertRow(i + 1);
            cell1 = row.insertCell(0);
            cell2 = row.insertCell(1);
            cell3 = row.insertCell(2);
            playerName = data[i].nickname;
            playerPoints = data[i].points;
            cell1.innerHTML = (i + 1);
            cell2.innerHTML = playerName;
            cell3.innerHTML = playerPoints
        }
    });
});