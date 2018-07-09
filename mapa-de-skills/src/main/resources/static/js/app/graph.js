var ctx = document.getElementById("firstGraph").getContext('2d');
var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ["Linguagem", "Framework", "Ferramenta"],
        datasets: [{
          label: 'Skills cadastradas',
          data: [totalLinguagem, totalFramework, totalFerramenta],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
            ],
            borderColor: [
                'rgba(255,99,132,1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero:true
                }
            }]
        }
    }
});


var cty = document.getElementById("secondGraph").getContext('2d');
var myPieChart = new Chart(cty,{
    type: 'pie',
    data: {
        labels: ["Linguagem", "Framework", "Ferramenta"],
        datasets: [{
          label: 'Skills cadastradas',
          data: [totalLinguagem, totalFramework, totalFerramenta],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
            ],
            borderColor: [
                'rgba(255,99,132,1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero:true
                }
            }]
        }
    }
});