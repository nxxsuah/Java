document.addEventListener('DOMContentLoaded', function(){

    const todoList = document.getElementById('todoList');
    const inputTodo = document.getElementById('inputTodo');
    const btnAdd = document.getElementById('btnAdd');


    // 저장된 데이터 불러오기
    let todos = JSON.parse(localStorage.getItem('todos')) || [];


    // 화면 출력
    renderTodo();



    /* =========================
        1. 데이터 등록
    ========================= */

    btnAdd.addEventListener('click', function(){

        const todoValue = inputTodo.value;


        if(todoValue == ''){
            alert('할 일을 입력하세요.');
            return;
        }


        // 배열에 데이터 추가
        todos.push(todoValue);


        // 데이터 저장
        saveTodo();


        // 화면 다시 출력
        renderTodo();


        inputTodo.value = '';

    });



    // 데이터 화면 출력
    function renderTodo(){

        todoList.innerHTML = '';


        todos.forEach(function(todo, index){


            const li = document.createElement('li');

            li.textContent = todo;


            const deleteBtn = document.createElement('button');

            deleteBtn.textContent = 'x';

            deleteBtn.className = 'delete-btn';



            deleteBtn.addEventListener('click', function(){

                deleteTodo(index);

            });



            li.appendChild(deleteBtn);

            todoList.appendChild(li);


        });

    }




    /* =========================
        2. 데이터 삭제 코드 작성
    ========================= */

    function deleteTodo(index){


        // 배열에서 선택 데이터 삭제
        todos.splice(index, 1);


        // 변경 데이터 저장
        saveTodo();


        // 화면 다시 출력
        renderTodo();


    }





    /* =========================
        3. 데이터 저장 코드 작성
        브라우저 새로고침시 추가한 데이터 유지
    ========================= */

    function saveTodo(){


        // 배열 데이터를 문자열로 변환 후 저장
        localStorage.setItem(
            'todos',
            JSON.stringify(todos)
        );


    }







    /* =========================
        4. 추가 기능
        배경 이모지 애니메이션
    ========================= */


    const icons = [
        '🌊','📝','📚','💻',
        '☕','🎧','⛺','🌿',
        '✨','⭐','⚾','💙'
    ];


    const floatingContainer =
        document.getElementById('floating-container');


    const container =
        document.querySelector('.container');



    icons.forEach(function(emoji){


        const icon =
            document.createElement('span');


        icon.className = 'floating-icon';

        icon.textContent = emoji;


        // 랜덤 위치
        icon.x =
            Math.random() * (container.clientWidth - 50);


        icon.y =
            Math.random() * (container.clientHeight - 50);



        // 이동 속도
        icon.dx =
            (Math.random() - 0.5) * 0.3;


        icon.dy =
            (Math.random() - 0.5) * 0.3;



        floatingContainer.appendChild(icon);


        moveIcon(icon);


    });




    function moveIcon(icon){


        function animate(){


            icon.x += icon.dx;

            icon.y += icon.dy;



            if(icon.x < 0 ||
               icon.x > container.clientWidth - 40){

                icon.dx *= -1;

            }


            if(icon.y < 0 ||
               icon.y > container.clientHeight - 40){

                icon.dy *= -1;

            }



            icon.style.left = icon.x + 'px';

            icon.style.top = icon.y + 'px';



            requestAnimationFrame(animate);


        }


        animate();


    }


});