$(document).ready(function () {
    var url = 'http://localhost:8080/exercise6and7/rest/quizes/quizes';

    $.getJSON(url, function (data) {
        var i, table, row, cell1, cell2, quizId, quizName, quizStartTime;
        table = document.getElementById("searchTable");

        for (i = 0; i < data.length; i++) {
            row = table.insertRow(i + 1);
            cell1 = row.insertCell(0);
            cell2 = row.insertCell(1);
            quizId = data[i].id;
            quizName = data[i].name;
            quizStartTime = data[i].startTime;
            cell1.innerHTML = quizName;
            cell2.innerHTML = quizStartTime
        }
    });
});