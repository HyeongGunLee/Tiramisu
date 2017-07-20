<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	google.charts.load('current', {
		'packages' : [ 'corechart' ]
	});
	google.charts.setOnLoadCallback(drawChart);//������Ʈ 
	google.charts.setOnLoadCallback(drawSeriesChart);//������Ʈ

	function selectHandler(e) {
		alert('The user selected' + PieChart.getSelection().length + ' items.');
	}

	function drawChart() { //������Ʈ Start
		var data = google.visualization.arrayToDataTable([ [ 'Task', '��ǥ��' ],
				[ '����', 15 ], [ '�߹�', 7 ], [ '����', 3 ] ]);

		var options = {
			title : '������Ʈ �� ȸ���� ���?',
			pieHole : 0.4,
			fontSize : 15
		};

		var chart = new google.visualization.PieChart(document
				.getElementById('donutchart'));
		chart.draw(data, options);

		//�̺�Ʈ �ڵ鷯
		google.visualization.events.addListener(chart, 'select', selectHandler);
		function selectHandler(e) {

			document.getElementById("body").innerHTML += '<div id="abc"><div id="popupContact"><form action="#�ǰ�ó��" id="voteform" method="post" name="voteform"><img id="close" width="25px" height="25px" src="images/x.png" onclick="div_hide()"><h2 id="headH2">�ǰ��� �ۼ����ּ���!</h2><hr><input id="name_readonly" name="name" type="text" value="���ٿ�" readonly><select id="bias" name="bias" style="width:82%;padding:10px;margin-top:30px;border:1px solid #ccc;	padding-left:40px;font-size:16px;font-family:raleway"><option value="">�������ּ���</option><option value="����">����</option><option value="�߹�">�߹�</option><option value="����">����</option>	</select><textarea id="opinion" name="opinion" placeholder="Please tell me your voice!"></textarea><a href="javascript:%20check_empty()" id="submit">Send</a></form></div></div>';
			console.log(document.getElementById("body").innerHTML);
			document.getElementById('abc').style.display = "block";
		}
	}//������Ʈ End

	function drawSeriesChart() { //������Ʈ Start

		var data = google.visualization.arrayToDataTable([
				[ 'Nickname', 'x��', 'y��', '��������', '����ũ��' ],
				[ '������', 92.11, 1.67, '��ǻ�Ͱ���', 33073 ],
				[ '���ٿ�', 85.05, 1.36, '�濵������', 40190 ],
				[ '�̼���', 60.60, 1.84, '��������', 55230 ],
				[ '������', 55.42, 2.78, '��ǻ�Ͱ���', 24716 ] ]);

		var options = {
			title : '���Ӻμ��� ' + '���� �� �⿩��/������',
			fontSize : 18,
			/* titleTextStyle : { fontsize : 30}, */
			hAxis : {
				title : 'x��'
			},
			vAxis : {
				title : 'y��'
			},
			bubble : {
				textStyle : {
					fontSize : 15
				}
			}
		};

		var chart = new google.visualization.BubbleChart(document
				.getElementById('series_chart_div'));
		chart.draw(data, options);
	}//������Ʈ END
</script>