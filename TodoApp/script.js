document.addEventListener('DOMContentLoaded', function () {

    /* =========================
       Todo 기능
    ========================= */

    const todoList = document.getElementById('todoList');
    const inputTodo = document.getElementById('inputTodo');
    const btnAdd = document.getElementById('btnAdd');

    // localStorage에 저장된 Todo 목록 불러오기
    let todos = JSON.parse(localStorage.getItem('todos')) || [];

    // Todo 목록 저장
    function saveTodoList() {
        localStorage.setItem('todos', JSON.stringify(todos));
    }

    // Todo 목록 출력
    function renderTodoList() {

        todoList.innerHTML = '';

        todos.forEach(function (todo, index) {

            const li = document.createElement('li');
            li.textContent = todo;

            const deleteBtn = document.createElement('button');
            deleteBtn.textContent = '✕';
            deleteBtn.className = 'delete-btn';

            // Todo 삭제
            deleteBtn.addEventListener('click', function () {

                todos.splice(index, 1);

                saveTodoList();
                renderTodoList();
            });

            li.appendChild(deleteBtn);
            todoList.appendChild(li);
        });
    }

    // Todo 추가
    function addTodo() {

        const todoText = inputTodo.value.trim();

        if (todoText === '') {
            alert('할 일을 입력하세요.');
            inputTodo.focus();
            return;
        }

        todos.push(todoText);

        saveTodoList();
        renderTodoList();

        inputTodo.value = '';
        inputTodo.focus();
    }

    // 추가 버튼 클릭
    btnAdd.addEventListener('click', addTodo);

    // Enter 키 입력
    inputTodo.addEventListener('keyup', function (e) {

        if (e.key === 'Enter') {
            addTodo();
        }
    });

    // 최초 목록 출력
    renderTodoList();


    /* =========================
       컨테이너 배경 이모지
    ========================= */

    const icons = [
        '🌊',
		'📝',
        '📚',
        '💻',
        '☕',
        '🎧',
        '⛺',
        '🌿',
        '✨',
        '⭐',
		'⚾',
		'🏋️‍♀️',
		'💙'
    ];

    const floatingContainer =
        document.getElementById('floating-container');

    const container =
        document.querySelector('.container');

    // 각 이모지 생성
    icons.forEach(function (emoji) {

        const icon = document.createElement('span');

        icon.className = 'floating-icon';
        icon.textContent = emoji;

        // 시작 위치
        icon.x = Math.random() * (container.clientWidth - 50);
        icon.y = Math.random() * (container.clientHeight - 50);

        // 이동 속도
        icon.dx = (Math.random() - 0.5) * 0.3;
        icon.dy = (Math.random() - 0.5) * 0.3;

        floatingContainer.appendChild(icon);

        moveIcon(icon);
    });


    /* =========================
       이모지 이동 애니메이션
    ========================= */

    function moveIcon(icon) {

        function animate() {

            icon.x += icon.dx;
            icon.y += icon.dy;

            // 좌우 벽 충돌
            if (icon.x < 0 ||
                icon.x > container.clientWidth - 40) {

                icon.dx *= -1;
            }

            // 상하 벽 충돌
            if (icon.y < 0 ||
                icon.y > container.clientHeight - 40) {

                icon.dy *= -1;
            }

            icon.style.left = icon.x + 'px';
            icon.style.top = icon.y + 'px';

            requestAnimationFrame(animate);
        }

        animate();
    }

});