<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="DAO.AppointmentDao"%>
<%@page import="DAO.DoctorDao"%>
<%@page import="DAO.PatientDao"%>
<%@page import="Models.Appointment"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>MediVist</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="assets/Admin/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="assets/Admin/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<!-- endinject -->
<!-- Layout styles -->
<link rel="stylesheet" href="assets/Admin/css/style.css">
<!-- End layout styles -->
<link rel="shortcut icon" href="assets/Admin/images/favicon.ico" />
</head>
<body>
	<div class="container-scroller">
		<!-- partial:../../partials/_navbar.html -->


		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:../../partials/_sidebar.html -->
			<jsp:include page="Header.jsp" />
			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="page-header">
						<h3 class="page-title">All Appointments</h3>
						<nav aria-label="breadcrumb">
							<ol class="breadcrumb">
								<li class="breadcrumb-item active" aria-current="page">Show
									All Appointments</li>
							</ol>
						</nav>
					</div>
					<div class="row">

						<div class="col-12">
							<div class="card">
								<div class="card-body">
									<div class="jumbotron">
										<div class="container">
											<div class="row">
												<div class="col-lg-6 ">
													<a href="addPatient" class="btn btn-primary"><i
														class="mdi mdi-account-plus" style="margin-right: 10px;"></i>Add
														Appointment</a> <a href="ExportPatients" class="btn btn-success"><i
														class="mdi mdi-file-excel" style="margin-right: 10px;"></i>Export</a>
												</div>
												<div class="col-lg-2"></div>
												
											</div>
										</div>
										<hr class="my-4">
									</div>

									<table class="table table-striped">
										<thead>
											<tr>
												<th>#</th>
												<th>Patient</th>
												<th>Doctor</th>
												<th>Speciality</th>
												<th>Date</th>
												<th>Link</th>
												<th>Status</th>
												<th></th>
											</tr>

										</thead>
										<tbody>
											<%
											ResultSet rs = AppointmentDao.getAllAppointments("NULL");
											ResultSet rs2 =null;
											ResultSet rs3 =null;
											if (rs != null && rs.next() == true) {
												do {
													rs2 = PatientDao.getPatient(rs.getInt(4));
													rs2.next();
													rs3 = DoctorDao.getDoctor(rs.getInt(5));
													rs3.next();
											%>
											<tr>
												<td class="py-1"><%=rs.getString(1)%></td>
												<td><%=rs2.getString(3) + " " + rs2.getString(4)%></td>
												<td><%=rs3.getString(3) + " " + rs3.getString(4)%></td>
												<td><%=rs3.getString(10)%></td>
												<td><%=rs.getString(2) + " " + rs.getString(3)%></td>
												<td><%=rs.getString(8)%></td>
												<td><%=rs.getString(6)%></td>
												<td class="px-4 py-3" style="text-align: center">
													<div class="flex items-center space-x-4 text-sm">

														<a href="AppointmentInfos?id=<%=rs.getString(1)%>"
															class="flex items-center justify-between px-2 py-2 text-sm font-medium leading-5 text-purple-600 rounded-lg dark:text-gray-400 focus:outline-none focus:shadow-outline-gray"
															aria-label="Show"> <svg
																xmlns="http://www.w3.org/2000/svg" width="16"
																height="16" fill="currentColor" class="w-5 h-5"
																viewBox="0 0 20 20">
                                        						<path
																	d="M16 8s-3-5.5-8-5.5S0 8 0 8s3 5.5 8 5.5S16 8 16 8zM1.173 8a13.133 13.133 0 0 1 1.66-2.043C4.12 4.668 5.88 3.5 8 3.5c2.12 0 3.879 1.168 5.168 2.457A13.133 13.133 0 0 1 14.828 8c-.058.087-.122.183-.195.288-.335.48-.83 1.12-1.465 1.755C11.879 11.332 10.119 12.5 8 12.5c-2.12 0-3.879-1.168-5.168-2.457A13.134 13.134 0 0 1 1.172 8z" />
                                        						<path
																	d="M8 5.5a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5zM4.5 8a3.5 3.5 0 1 1 7 0 3.5 3.5 0 0 1-7 0z" />
                                    						</svg>
														</a> <a href="editAppointment?id=<%=rs.getString(1)%>"
															class="flex items-center justify-between px-2 py-2 text-sm font-medium leading-5 text-purple-600 rounded-lg dark:text-gray-400 focus:outline-none focus:shadow-outline-gray"
															aria-label="edit"> <svg
																xmlns="http://www.w3.org/2000/svg" width="16"
																height="16" fill="black" class="w-5 h-5"
																viewBox="0 0 20 20">
                                        						<path
																	d="M13.586 3.586a2 2 0 112.828 2.828l-.793.793-2.828-2.828.793-.793zM11.379 5.793L3 14.172V17h2.828l8.38-8.379-2.83-2.828z"> </path>
                                    						</svg>
														</a> <a href="CancelAppointment?id=<%=rs.getString(1)%>"
															class="flex items-center justify-between px-2 py-2 text-sm font-medium leading-5 text-purple-600 rounded-lg dark:text-gray-400 focus:outline-none focus:shadow-outline-gray"
															aria-label="cancel"> <svg
																xmlns="http://www.w3.org/2000/svg" width="16"
																height="16" fill="red" class="bi bi-arrow-repeat"
																viewBox="0 0 16 16">
  																	<path
																	<path d="M2.146 2.854a.5.5 0 1 1 .708-.708L8 7.293l5.146-5.147a.5.5 0 0 1 .708.708L8.707 8l5.147 5.146a.5.5 0 0 1-.708.708L8 8.707l-5.146 5.147a.5.5 0 0 1-.708-.708L7.293 8 2.146 2.854Z"/> />
																				</svg>
														</a> <a href="AppointmentSoftDelete?id=<%=rs.getString(1)%>"
															class="flex items-center justify-between px-2 py-2 text-sm font-medium leading-5 text-purple-600 rounded-lg dark:text-gray-400 focus:outline-none focus:shadow-outline-gray"
															aria-label="delete"> <svg
																xmlns="http://www.w3.org/2000/svg" width="16"
																height="16" fill="orange" class="w-5 h-5"
																viewBox="0 0 20 20">
                                        						<path
																	d="M9 2a1 1 0 00-.894.553L7.382 4H4a1 1 0 000 2v10a2 2 0 002 2h8a2 2 0 002-2V6a1 1 0 100-2h-3.382l-.724-1.447A1 1 0 0011 2H9zM7 8a1 1 0 012 0v6a1 1 0 11-2 0V8zm5-1a1 1 0 00-1 1v6a1 1 0 102 0V8a1 1 0 00-1-1z"> </path>
                                    						</svg>
														</a>
													</div>
												</td>
											</tr>
											<%
											} while (rs.next());
											} else {
											%>
											<tr>
												<td colspan="8"><center>No data to show!</center></td>
											</tr>
											<%
											}
											%>
										</tbody>
									</table>

								</div>
							</div>
						</div>
					</div>
					<table border="0">
						<tr>

						</tr>
						<tr>
							<td><div id="result"></div></td>
						</tr>
					</table>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->

				<jsp:include page="Footer.jsp" />
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="assets/Admin/vendors/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<script src="assets/Admin/vendors/chart.js/Chart.min.js"></script>
	<script src="assets/Admin/js/jquery.cookie.js" type="text/javascript"></script>
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="assets/Admin/js/off-canvas.js"></script>
	<script src="assets/Admin/js/hoverable-collapse.js"></script>
	<script src="assets/Admin/js/misc.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page -->
	<script src="assets/Admin/js/dashboard.js"></script>
	<script src="assets/Admin/js/todolist.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<%
	String status = "";
	if (request.getParameter("status") != null) {
		status = request.getParameter("status");
	}
	System.out.println(request.getParameter("test"));
	System.out.println(status);
	if (status.equals("successSoftDelete")) {
	%>
	<script>
		swal({
			title : "Success!",
			text : "You have moved the patient to the trash successfully!",
			icon : "success",
			button : "Okay!",
		}).then(function() {
			window.location.replace("/telemedicine/AllAppointments");
		});
	</script>
	<%
	} else if (status.equals("successUpdate")) {
	%>
	<script>
		swal({
			title : "Success!",
			text : "You have updated the patient successfully!",
			icon : "success",
			button : "Okay!",
		}).then(function() {
			window.location.replace("/telemedicine/AllAppointments");
		});
	</script>
	<%
	} else if (status.equals("failed")) {
	%>
	<script>
		swal({
			title : "Error!",
			text : "An error occurred, Please try again!",
			icon : "error",
			button : "Okay!",
		}).then(function() {
			window.location.replace("/telemedicine/AllAppointments");
		});
	</script>
	<%
	} else if (status.equals("successResetPassword")) {
	%>
	<script>
		swal({
			title : "Success!",
			text : "Username and Password have been updated successfully!",
			icon : "success",
			button : "Okay!",
		}).then(function() {
			window.location.replace("/telemedicine/AllAppointments");
		});
	</script>
	<%
	}
	%>




	<!-- End custom js for this page -->
</body>
</html>