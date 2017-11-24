$(document).ready(function () {
    var url, i, questionId, question, answerA, answerB, answerC, answerD, correctAnswer, file, questionQuiz, questionAQuiz,
        questionBQuiz, questionCQuiz, questionDQuiz, questionImage, increase = 0;
    url = 'http://localhost:8080/exercise6and7/rest/quizes/question/';


    $.getJSON(url, function (data) {
        for (i = 0; i < data.length; i++) {
            questionId = data[i + increase].id;
            question = data[i].question;
            answerA = data[i].answerA;
            answerB = data[i].answerB;
            answerC = data[i].answerC;
            answerD = data[i].answerD;
            correctAnswer = data[i].correctAnswer;
            file = data[increase].file;

            questionQuiz = document.getElementById("questionQuiz");
            questionAQuiz = document.getElementById("answerA");
            questionBQuiz = document.getElementById("answerB");
            questionCQuiz = document.getElementById("answerC");
            questionDQuiz = document.getElementById("answerD");
            questionImage = document.getElementById("picture");
            questionQuiz.innerHTML = question;
            questionAQuiz.innerHTML = answerA;
            questionBQuiz.innerHTML = answerB;
            questionCQuiz.innerHTML = answerC;
            questionDQuiz.innerHTML = answerD;


            countdownTimer();
            setTimeout(function () {
                if (correctAnswer === "A") {
                    document.getElementById("answerA").style.background = "lightgreen";
                } else if (correctAnswer === "B") {
                    document.getElementById("answerB").style.background = "lightgreen";
                } else if (correctAnswer === "C") {
                    document.getElementById("answerC").style.background = "lightgreen";
                } else if (correctAnswer === "D") {
                    document.getElementById("answerD").style.background = "lightgreen";
                }
            }, 10000);
        }
    });

    function toLoad() {
        document.getElementById("answerA").style.background = "none";
        document.getElementById("answerB").style.background = "none";
        document.getElementById("answerC").style.background = "none";
        document.getElementById("answerD").style.background = "none";
        $.getJSON(url, function (data) {
            for (i = 0; i < data.length; i++) {
                questionId = data[i + increase].id;
                question = data[i].question;
                answerA = data[i].answerA;
                answerB = data[i].answerB;
                answerC = data[i].answerC;
                answerD = data[i].answerD;
                correctAnswer = data[i].correctAnswer;
                file = data[increase].file;

                questionQuiz = document.getElementById("questionQuiz");
                questionAQuiz = document.getElementById("answerA");
                questionBQuiz = document.getElementById("answerB");
                questionCQuiz = document.getElementById("answerC");
                questionDQuiz = document.getElementById("answerD");
                questionImage = document.getElementById("picture");
                questionQuiz.innerHTML = question;
                questionAQuiz.innerHTML = answerA;
                questionBQuiz.innerHTML = answerB;
                questionCQuiz.innerHTML = answerC;
                questionDQuiz.innerHTML = answerD;


                countdownTimer();
                setTimeout(function () {
                    if (correctAnswer === "A") {
                        document.getElementById("answerA").style.background = "lightgreen";
                    } else if (correctAnswer === "B") {
                        document.getElementById("answerB").style.background = "lightgreen";
                    } else if (correctAnswer === "C") {
                        document.getElementById("answerC").style.background = "lightgreen";
                    } else if (correctAnswer === "D") {
                        document.getElementById("answerD").style.background = "lightgreen";
                    }
                }, 10000);
            }
        });
        increase++;
    }
    setInterval(toLoad, 13000);
});



//Countdown function
function countdownTimer() {
    var countDownDate, x, now, distance, seconds, inputSec;
    countDownDate = new Date().getTime();
    x = setInterval(function () {
        now = new Date().getTime();
        distance = countDownDate - (now - 10000);
        seconds = Math.floor((distance % (1000 * 60)) / 1000);
        inputSec = document.getElementById("timer");
        inputSec.innerHTML = seconds + "s";
        if (seconds > 5){
            inputSec.style.color = "green";
        }else if (seconds < 5) {
            inputSec.style.color = "red";
            if (seconds < 1) {
                clearInterval(x);
                inputSec.innerHTML = "NEXT QUESTION";
            }
        }
    }, 1000);
}

//Sorting table function
function sortTable(n) {
    var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
    table = document.getElementById("searchTable");
    switching = true;
    dir = "asc";
    while (switching) {
        switching = false;
        rows = table.getElementsByTagName("tr");
        for (i = 1; i < (rows.length - 1); i++) {
            shouldSwitch = false;
            x = rows[i].getElementsByTagName("td")[n];
            y = rows[i + 1].getElementsByTagName("td")[n];
            if (dir == "asc") {
                if ( (x.innerHTML.toUpperCase() > y.innerHTML.toUpperCase())) {
                    shouldSwitch= true;
                    break;
                }
            } else if (dir == "desc") {
                if (x.innerHTML.toUpperCase() < y.innerHTML.toUpperCase()) {
                    shouldSwitch= true;
                    break;
                }
            }
        }
        if (shouldSwitch) {
            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
            switching = true;
            switchcount ++;
        } else {
            if (switchcount == 0 && dir == "asc") {
                dir = "desc";
                switching = true;
            }
        }
    }
}

function searchFunction() {
    var input, filter, table, tr, td0, td1, td2, i;
    input = document.getElementById("searchInput");
    filter = input.value.toUpperCase();
    table = document.getElementById("searchTable");
    tr = table.getElementsByTagName("tr");
    for (i = 0; i < tr.length; i++) {
        td0 = tr[i].getElementsByTagName("td")[0];
        td1 = tr[i].getElementsByTagName("td")[1];
        td2 = tr[i].getElementsByTagName("td")[2];
        if (td0 || td1 || td2) {
            if ((td0.innerHTML.toUpperCase().indexOf(filter) > -1) || (td1.innerHTML.toUpperCase().indexOf(filter) > -1) || (td2.innerHTML.toUpperCase().indexOf(filter) > -1)) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}

function changeDiv() {
    document.getElementById("changeable").style.display = "none";
    document.getElementById("changeable2").style.display = "block";
}
//Reset all questions
function nextQuestion() {
    setTimeout(function () {
        document.getElementById("inputQuestionQuestionCreator").value = "";
        document.getElementById("inputAnswerAQuestionCreator").value = "";
        document.getElementById("inputAnswerBQuestionCreator").value = "";
        document.getElementById("inputAnswerCQuestionCreator").value = "";
        document.getElementById("inputAnswerDQuestionCreator").value = "";
        document.getElementById("inputCorrectAnswerQuestionCreator").value = "";
        document.getElementById("addedFileQuestionCreator").value = "";
    }, 100);
}