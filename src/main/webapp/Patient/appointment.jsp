<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>MEDIVISIT</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="../assets/Doctor/img/flavicon.png" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="../assets/Doctor/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="../assets/Doctor/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="../assets/Doctor/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="../assets/Doctor//css/style.css" rel="stylesheet">
</head>

<body>
    <div class="container-xxl position-relative bg-white d-flex p-0">
        <!-- Spinner Start -->
        <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                <span class="sr-only">Loading...</span>
            </div>
        </div>
        <!-- Spinner End -->


        <!-- Sidebar Start -->
        <div class="sidebar pe-4 pb-3">
            <nav class="navbar bg-light navbar-light">
               
                <a href="index.jsp" class="navbar-brand mx-4 mb-3">
                    <h3 class="text-primary"><img src="../assets/Doctor/img/3.png" alt="" style="height: 60px;">MEDIVISIT</h3>
                </a>
                <div class="d-flex align-items-center ms-4 mb-4">
                    <div class="position-relative">
                        <img class="rounded-circle" src="../assets/Doctor/img/testimonial-1.jpg" alt="" style="width: 40px; height: 40px;">
                        <div class="bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1"></div>
                    </div>
                    <div class="ms-3">
                        <h6 class="mb-0">Fatima FRIST</h6>
                        <span>DOCTOR</span>
                    </div>
                </div>

                <div class="navbar-nav w-100">
                    <a href="index.jsp" class="nav-item nav-link "><i class="fa fa-tachometer-alt me-2"></i>Dashboard</a>
                   
                    <a href="appointment.jsp" class="nav-item nav-link active"><i class="fa fa-medkit  me-2"></i>Appointments</a>
                    <a href="patients.jsp" class="nav-item nav-link"><i class="fa fa-user-plus me-2" aria-hidden="true"></i>Patients</a>
                    <a href="profil.jsp" class="nav-item nav-link"><i class="fa fa-user-md me-2" aria-hidden="true"></i>Profil</a>
                    
                    
                </div>
            </nav>
        </div>
        <!-- Sidebar End -->


        <!-- Content Start -->
        <div class="content">
            <!-- Navbar Start -->
			<nav
				class="navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0">
				<a href="index.jsp" class="navbar-brand d-flex d-lg-none me-4">
					<h2 class="text-primary mb-0">
						<img
							src="<%= request.getContextPath() %>/assets/Doctor/img/flavicon.png"
							alt="" style="height: 30px;">
					</h2>
				</a> <a href="#" class="sidebar-toggler flex-shrink-0"> <i
					class="fa fa-bars"></i>
				</a>

				<div class="navbar-nav align-items-center ms-auto">
					
					
					<div class="nav-item dropdown">
						<a href="#" class="nav-link dropdown-toggle"
							data-bs-toggle="dropdown"> <img
							class="rounded-circle me-lg-2"
							src="<%= request.getContextPath() %><%= session.getAttribute("Image") %>"
							alt="" style="width: 40px; height: 40px;"> <span
							class="d-none d-lg-inline-flex"><%= session.getAttribute("fullname") %></span>
						</a>
						<div
							class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
							<a href="<%= request.getContextPath() %>/Doctor/profil.jsp" class="dropdown-item">My Profile</a>  <a href="<%= request.getContextPath() %>/logout"
								class="dropdown-item">Log Out</a>
						</div>
					</div>
				</div>
			</nav>
			<!-- Navbar End -->


            <!-- Table Start -->
            <div class="container-fluid pt-4 px-4">
                <div class="row g-4">
                   
                                    
                    <div class="col-12">
                        <div class="bg-light rounded h-100 p-4">
                            <h6 class="mb-4">Appointments</h6>
                            <div class="table-responsive">
                                <table class="table text-start align-middle table-bordered table-hover mb-0">
                                    <thead>
                                        <tr class="text-dark text-center">
                                            <th scope="col">Date</th>
                                            <th scope="col">Link</th>
                                            <th scope="col">Patient</th>
                                            <th scope="col">Amount</th>
                                            <th scope="col">Status</th>
                                            <th scope="col">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="text-center">
                                            <td name="date">01 Jan 2045</td>
                                            <td name="link">INV-0123</td>
                                            <td name="patient">Jhon Doe</td>
                                            <td name="amount">$123</td>
                                            <td name="status">Paid</td>
                                            <td><a class="btn btn-sm btn-primary" href="" name="action">Pending</a></td>
                                        </tr>
                                        <tr class="text-center">
                                            <td>01 Jan 2045</td>
                                            <td>INV-0123</td>
                                            <td>Jhon Doe</td>
                                            <td>$123</td>
                                            <td>Paid</td>
                                            <td><a class="btn btn-sm btn-primary" href="">Pending</a></td>
                                        </tr>
                                        <tr class="text-center">
                                            <td>01 Jan 2045</td>
                                            <td>INV-0123</td>
                                            <td>Jhon Doe</td>
                                            <td>$123</td>
                                            <td>Paid</td>
                                            <td><a class="btn btn-sm btn-primary" href="">Pending</a></td>
                                        </tr>
                                        <tr class="text-center">
                                            <td>01 Jan 2045</td>
                                            <td>INV-0123</td>
                                            <td>Jhon Doe</td>
                                            <td>$123</td>
                                            <td>Not Paid</td>
                                            <td><a class="btn btn-sm btn-primary" href="">Pending</a></td>
                                        </tr>
                                        <tr class="text-center"> 
                                            <td>01 Jan 2045</td>
                                            <td>INV-0123</td>
                                            <td>Jhon Doe</td>
                                            <td>$123</td>
                                            <td>Not Paid</td>
                                            <td><a class="btn btn-sm btn-primary" href="">Pending</a></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Table End -->


            <!-- Footer Start -->
            <div class="container-fluid pt-4 px-4">
                <div class="bg-light rounded-top p-4">
                    <div class="row">
                        <div class="col-12 col-sm-6 text-center text-sm-start">
                            &copy; <a href="#">MEDIVISIT</a>, All Right Reserved. 
                        </div>
                        
                    </div>
                </div>
            </div>
            <!-- Footer End -->
        </div>
        <!-- Content End -->


        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
    </div>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="../assets/Doctor/lib/chart/chart.min.js"></script>
    <script src="../assets/Doctor/lib/easing/easing.min.js"></script>
    <script src="../assets/Doctor/lib/waypoints/waypoints.min.js"></script>
    <script src="../assets/Doctor/lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="../assets/Doctor/lib/tempusdominus/js/moment.min.js"></script>
    <script src="../assets/Doctor/lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="../assets/Doctor/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Template Javascript -->
    <script src="../assets/Doctor/js/main.js"></script>
</body>

</html>