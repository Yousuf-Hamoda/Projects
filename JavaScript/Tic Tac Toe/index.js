var turn = false;
var grid = {
    1: document.getElementById("1"),
    2: document.getElementById("2"),
    3: document.getElementById("3"),
    4: document.getElementById("4"),
    5: document.getElementById("5"),
    6: document.getElementById("6"),
    7: document.getElementById("7"),
    8: document.getElementById("8"),
    9: document.getElementById("9"),
};

var gridList = [
    document.getElementById("1"),
    document.getElementById("2"),
    document.getElementById("3"),
    document.getElementById("4"),
    document.getElementById("5"),
    document.getElementById("6"),
    document.getElementById("7"),
    document.getElementById("8"),
    document.getElementById("9"),
];

var win = function () {
    gridList.forEach(element => {
        element.innerHTML = " "
    });
    
    if (turn) {
        document.getElementById("score1").innerHTML = (parseInt(document.getElementById("score1").innerHTML) + 1);
    } else {
        document.getElementById("score2").innerHTML = (parseInt(document.getElementById("score2").innerHTML) + 1);
    }

    turn = false;

    game();
}

var check = function () {
    if (grid[1].innerHTML == grid[2].innerHTML && grid[1].innerHTML == grid[3].innerHTML && grid[2].innerHTML == grid[3].innerHTML && grid[1].innerHTML !== " " && grid[2].innerHTML !== " " && grid[3].innerHTML !== " ") {
        console.log("1")
        setTimeout(win(), 100); 
    }
    if (grid[4].innerHTML == grid[5].innerHTML && grid[4].innerHTML == grid[6].innerHTML && grid[5].innerHTML == grid[6].innerHTML && grid[4].innerHTML !== " " && grid[5].innerHTML !== " " && grid[6].innerHTML !== " ") {
        console.log("2")
        setTimeout(win(), 100); 
    }
    if (grid[7].innerHTML == grid[8].innerHTML && grid[7].innerHTML == grid[9].innerHTML && grid[8].innerHTML == grid[9].innerHTML && grid[7].innerHTML !== " " && grid[8].innerHTML !== " " && grid[9].innerHTML !== " ") {
        console.log("3")
        setTimeout(win(), 100); 
    }
    if (grid[1].innerHTML == grid[4].innerHTML && grid[1].innerHTML == grid[7].innerHTML && grid[4].innerHTML == grid[7].innerHTML && grid[1].innerHTML !== " " && grid[4].innerHTML !== " " && grid[7].innerHTML !== " ") {
        console.log("4")
        setTimeout(win(), 100); 
    }
    if (grid[2].innerHTML == grid[5].innerHTML && grid[2].innerHTML == grid[8].innerHTML && grid[5].innerHTML == grid[8].innerHTML && grid[2].innerHTML !== " " && grid[5].innerHTML !== " " && grid[8].innerHTML !== " ") {
        console.log("5")
        setTimeout(win(), 100); 
    }
    if (grid[3].innerHTML == grid[6].innerHTML && grid[3].innerHTML == grid[9].innerHTML && grid[6].innerHTML == grid[9].innerHTML && grid[3].innerHTML !== " " && grid[6].innerHTML !== " " && grid[9].innerHTML !== " ") {
        console.log("6")
        setTimeout(win(), 100); 
    }
    if (grid[1].innerHTML == grid[5].innerHTML && grid[1].innerHTML == grid[9].innerHTML && grid[5].innerHTML == grid[9].innerHTML && grid[1].innerHTML !== " " && grid[5].innerHTML !== " " && grid[9].innerHTML !== " ") {
        console.log("7")
        setTimeout(win(), 100); 
    }
    if (grid[3].innerHTML == grid[5].innerHTML && grid[3].innerHTML == grid[7].innerHTML && grid[5].innerHTML == grid[7].innerHTML && grid[3].innerHTML !== " " && grid[5].innerHTML !== " " && grid[7].innerHTML !== " ") {
        console.log("8")
        setTimeout(win(), 100); 
    }

    let all = 0;

    gridList.forEach(element => {
        if (element.innerHTML !== " ") {
            all += 1;
        }

        if (all == 9) {
            setTimeout(() => {
                gridList.forEach(element => {
                    element.innerHTML = " "
                });
            }, 100); 
            all = 0;
        }
    });
}

var game = function () { 
    gridList.forEach(element => {
        element.addEventListener("click", function() {
            turn = !turn;
            element.innerHTML = turn ? "X" : "O";
            check();
        }, {once : true});    
    });
};

game();