//window 객체는 웹브라우저 전체를 의미한다.
window.addEventListener('load',

function()
{
    //alert("아놔 머리 터지겠네!!!");

    //클래스명이 sound인 것을 모두 선택
    const sounds = document.querySelectorAll(".sound");

    //클래스명이 pads 인 태그의 후손 중에서 div 태그들을 모두 선택
    const pads = document.querySelectorAll(".pads div");

    //클래스명이 visual인 태그 하나 선택
    const visual = document.querySelector('.visual');

    //클래스명이 title인 태그 하나 선택
    const title = document.querySelector('.title');

    //초기화할 때 쓰임
    const colors = ["lightblue", "green", " blue", "red", "orangered", "orange", " darkcyan"];

    //재생되는 음악이 끝나면, .visual에서 비주얼과 제목 제거

    sounds.forEach(
       function(snd) {
           snd.onended = function () {
           visual.innerHTML = "";
           title.innerHTML = "";
       } 
    }
    
    );
       /* sounds.forEach(snd => {
            snd.onended = function() {
                visual.innerHTML = "";
                title.innerHTML = ""; */
            
                pads.forEach( function(pad, index) {
                    pad.addEventListener('click', function(){
                        //기존에 재생되는 음악을 중지 시켜야 한다.
                       sounds.forEach(function(inx) {
                        //console.log(inx);
                        inx.pause();
                       });
                       if(sounds[index]){
                        sounds[index].currentTime = 0;
                        sounds[index].play();
        
                        //뮤직 제목을 출력해 준다.
                        //console.log(sounds[index].src) ;
                        const strArray = sounds[index].src.split("sound/");
                        title.innerHTML = strArray[1];
                        //alert(strArray[0]);
                        //alert(strArray[1]);
                       }
                       
                        //볼만들고 애니메이션 하기
                        createBubbles(index);
                    });
                });

            

            const createBubbles = function(index)
            {
                visual.innerHTML = "";
                const bubble = document.createElement("div");
                visual.appendChild(bubble);
                bubble.style.backgroundColor = colors[index];
                bubble.style.top = '300px';
                bubble.style.animation = 'animation 2000ms linear infinite both';
            }
        
}

);