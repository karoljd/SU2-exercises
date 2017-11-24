$(document).ready(function () {
    var quizName, startTime, questionName, answerA, answerB, answerC, answerD, correctAnswer, file, quiz, question, questions, myJSONquizName, myJSONquestions;
    quizName = "";
    startTime = "";
    quiz = ["Pusty"];
    questions = [];

    $("#createQuestionQuizCreator").click(function () {
        quizName = document.getElementById("inputNameQuizCreator").value;
        startTime = document.getElementById("inputStartTimeQuizCreator").value;
        quiz = [quizName, startTime];
        myJSONquizName = JSON.stringify(quiz);
        console.log("myJSONquizName: " + myJSONquizName);
    });



    $("#nextQuestionQuizCreator").click(function () {
        questionName = document.getElementById("inputQuestionQuestionCreator").value;
        answerA = document.getElementById("inputAnswerAQuestionCreator").value;
        answerB = document.getElementById("inputAnswerBQuestionCreator").value;
        answerC = document.getElementById("inputAnswerCQuestionCreator").value;
        answerD = document.getElementById("inputAnswerDQuestionCreator").value;
        correctAnswer = document.getElementById("inputCorrectAnswerQuestionCreator").value;
        file = document.getElementById("addedFileQuestionCreator").value;
        question = [questionName, answerA, answerB, answerC, answerD, correctAnswer, file];
        if(question[6] !== null) {
            question[6] = question[6].replace("C:\\fakepath\\", "../media/");
        }
        myJSONquestions = JSON.stringify(question);
        questions += myJSONquestions;
        console.log("myJSONquestions: " + questions);

    })

    $("#saveQuiz").click(function () {
        $.post("rest/quizes/quizes", quiz);
        $.post("rest/quizes/question", questions);
    });
});