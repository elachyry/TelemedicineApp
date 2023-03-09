<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    		<nav class="navbar bg-light navbar-light">
                <a href="index.jsp" class="navbar-brand mx-4 mb-3">
                    <h3 class="text-primary">MEDIVISIT</h3>
                </a>
                <div class="d-flex align-items-center ms-4 mb-4">
                    <div class="position-relative">
                        <img class="rounded-circle" src="../assets/Doctor/img/testimonial-1.jpg" alt="" style="width: 40px; height: 40px;">
                        <div class="bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1"></div>
                    </div>
                    <div class="ms-3">
                        <h6 class="mb-0"><%= session.getAttribute("fullname") %></h6>
                        <span>DOCTOR</span>
                    </div>
                </div>
                
                <div class="navbar-nav w-100">
                    <a href="index.jsp" class="nav-item nav-link active"><i class="fa fa-house me-2"></i>Home</a>
                   
                    <a href="appointment.jsp" class="nav-item nav-link"><i class="fa fa-medkit  me-2"></i>Appointments</a>
                    <a href="patients.jsp" class="nav-item nav-link"><i class="fa fa-user-plus me-2" aria-hidden="true"></i>Patients</a>
                    <a href="messages.jsp" class="nav-item nav-link"><i class="fa fa-envelope me-2" aria-hidden="true"></i>Messages</a>
                    <a href="profil.jsp" class="nav-item nav-link"><i class="fa fa-user-md me-2" aria-hidden="true"></i>Profil</a>

                    
                </div>
            </nav>