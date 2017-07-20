function check_empty() {
if (document.getElementById('name').value == "" || document.getElementById('bias').value == "" || document.getElementById('opinion').value == "") {
alert("빈 칸을 채워주세요! !");
} else {
document.getElementById('form').submit();
alert("의견이 성공적으로 작성되었습니다!");
}
}
//Function To Display Popup
function div_show() {
document.getElementById('abc').style.display = "block";
}
//Function to Hide Popup
function div_hide(){
document.getElementById('abc').style.display = "none";
}