/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-02-25 16:08:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <nav class=\"navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\r\n");
      out.write("        <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\r\n");
      out.write("          <a class=\"navbar-brand brand-logo\" href=\"index.html\"><img src=\"assets/Admin/images/logo.svg\" alt=\"logo\" /></a>\r\n");
      out.write("          <a class=\"navbar-brand brand-logo-mini\" href=\"index.html\"><img src=\"assets/Admin/images/logo-mini.svg\" alt=\"logo\" /></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-menu-wrapper d-flex align-items-stretch\">\r\n");
      out.write("          <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\r\n");
      out.write("            <span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <div class=\"search-field d-none d-md-block\">\r\n");
      out.write("            <form class=\"d-flex align-items-center h-100\" action=\"#\">\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <div class=\"input-group-prepend bg-transparent\">\r\n");
      out.write("                  <i class=\"input-group-text border-0 mdi mdi-magnify\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"text\" class=\"form-control bg-transparent border-0\" placeholder=\"Search projects\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <ul class=\"navbar-nav navbar-nav-right\">\r\n");
      out.write("            <li class=\"nav-item nav-profile dropdown\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" id=\"profileDropdown\" href=\"#\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                <div class=\"nav-profile-img\">\r\n");
      out.write("                  <img src=\"assets/Admin/images/faces/face1.jpg\" alt=\"image\">\r\n");
      out.write("                  <span class=\"availability-status online\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"nav-profile-text\">\r\n");
      out.write("                  <p class=\"mb-1 text-black\">ELACHYRY Mohammed</p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"dropdown-menu navbar-dropdown\" aria-labelledby=\"profileDropdown\">\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                  <i class=\"mdi mdi-cached me-2 text-success\"></i> Activity Log </a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                  <i class=\"mdi mdi-logout me-2 text-primary\"></i> Signout </a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item d-none d-lg-block full-screen-link\">\r\n");
      out.write("              <a class=\"nav-link\">\r\n");
      out.write("                <i class=\"mdi mdi-fullscreen\" id=\"fullscreen-button\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a class=\"nav-link count-indicator dropdown-toggle\" id=\"messageDropdown\" href=\"#\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                <i class=\"mdi mdi-email-outline\"></i>\r\n");
      out.write("                <span class=\"count-symbol bg-warning\"></span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"messageDropdown\">\r\n");
      out.write("                <h6 class=\"p-3 mb-0\">Messages</h6>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                  <div class=\"preview-thumbnail\">\r\n");
      out.write("                    <img src=\"assets/Admin/images/faces/face4.jpg\" alt=\"image\" class=\"profile-pic\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("                    <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Mark send you a message</h6>\r\n");
      out.write("                    <p class=\"text-gray mb-0\"> 1 Minutes ago </p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                  <div class=\"preview-thumbnail\">\r\n");
      out.write("                    <img src=\"assets/Admin/images/faces/face2.jpg\" alt=\"image\" class=\"profile-pic\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("                    <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Cregh send you a message</h6>\r\n");
      out.write("                    <p class=\"text-gray mb-0\"> 15 Minutes ago </p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                  <div class=\"preview-thumbnail\">\r\n");
      out.write("                    <img src=\"assets/Admin/images/faces/face3.jpg\" alt=\"image\" class=\"profile-pic\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("                    <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Profile picture updated</h6>\r\n");
      out.write("                    <p class=\"text-gray mb-0\"> 18 Minutes ago </p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <h6 class=\"p-3 mb-0 text-center\">4 new messages</h6>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a class=\"nav-link count-indicator dropdown-toggle\" id=\"notificationDropdown\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("                <i class=\"mdi mdi-bell-outline\"></i>\r\n");
      out.write("                <span class=\"count-symbol bg-danger\"></span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"notificationDropdown\">\r\n");
      out.write("                <h6 class=\"p-3 mb-0\">Notifications</h6>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                  <div class=\"preview-thumbnail\">\r\n");
      out.write("                    <div class=\"preview-icon bg-success\">\r\n");
      out.write("                      <i class=\"mdi mdi-calendar\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("                    <h6 class=\"preview-subject font-weight-normal mb-1\">Event today</h6>\r\n");
      out.write("                    <p class=\"text-gray ellipsis mb-0\"> Just a reminder that you have an event today </p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                  <div class=\"preview-thumbnail\">\r\n");
      out.write("                    <div class=\"preview-icon bg-warning\">\r\n");
      out.write("                      <i class=\"mdi mdi-settings\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("                    <h6 class=\"preview-subject font-weight-normal mb-1\">Settings</h6>\r\n");
      out.write("                    <p class=\"text-gray ellipsis mb-0\"> Update dashboard </p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item preview-item\">\r\n");
      out.write("                  <div class=\"preview-thumbnail\">\r\n");
      out.write("                    <div class=\"preview-icon bg-info\">\r\n");
      out.write("                      <i class=\"mdi mdi-link-variant\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("                    <h6 class=\"preview-subject font-weight-normal mb-1\">Launch Admin</h6>\r\n");
      out.write("                    <p class=\"text-gray ellipsis mb-0\"> New admin wow! </p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <h6 class=\"p-3 mb-0 text-center\">See all notifications</h6>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item nav-logout d-none d-lg-block\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                <i class=\"mdi mdi-power\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item nav-settings d-none d-lg-block\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                <i class=\"mdi mdi-format-line-spacing\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\r\n");
      out.write("            <span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <!-- partial -->\r\n");
      out.write("      <div class=\"container-fluid page-body-wrapper\">\r\n");
      out.write("        <!-- partial:partials/_sidebar.html -->\r\n");
      out.write("        <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\r\n");
      out.write("          <ul class=\"nav\">\r\n");
      out.write("            <li class=\"nav-item nav-profile\">\r\n");
      out.write("              <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("                <div class=\"nav-profile-image\">\r\n");
      out.write("                  <img src=\"assets/Admin/images/faces/face1.jpg\" alt=\"profile\">\r\n");
      out.write("                  <span class=\"login-status online\"></span>\r\n");
      out.write("                  <!--change to offline or busy as needed-->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"nav-profile-text d-flex flex-column\">\r\n");
      out.write("                  <span class=\"font-weight-bold mb-2\">ELACHYRY</span>\r\n");
      out.write("                  <span class=\"text-secondary text-small\">Project Manager</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <i class=\"mdi mdi-bookmark-check text-success nav-profile-badge\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"AdminIndexServlet\">\r\n");
      out.write("                <span class=\"menu-title\">Dashboard</span>\r\n");
      out.write("                <i class=\"mdi mdi-home menu-icon\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" data-bs-toggle=\"collapse\" href=\"#ui-appointments\" aria-expanded=\"false\" aria-controls=\"ui-appointments\">\r\n");
      out.write("                <span class=\"menu-title\">Appointments</span>\r\n");
      out.write("                <i class=\"menu-arrow\"></i>\r\n");
      out.write("                <i class=\"mdi mdi-book-open-page-variant menu-icon\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"collapse\" id=\"ui-appointments\">\r\n");
      out.write("                <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/buttons.html\">All Appointments</a></li>\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/typography.html\">Add</a></li>\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/typography.html\">Trash</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" data-bs-toggle=\"collapse\" href=\"#ui-doctors\" aria-expanded=\"false\" aria-controls=\"ui-doctors\">\r\n");
      out.write("                <span class=\"menu-title\">Doctors</span>\r\n");
      out.write("                <i class=\"menu-arrow\"></i>\r\n");
      out.write("                <i class=\"mdi mdi-stethoscope menu-icon\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"collapse\" id=\"ui-doctors\">\r\n");
      out.write("                <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/buttons.html\">All Doctors</a></li>\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/typography.html\">Add</a></li>\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/typography.html\">Trash</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" data-bs-toggle=\"collapse\" href=\"#ui-patients\" aria-expanded=\"false\" aria-controls=\"ui-patients\">\r\n");
      out.write("                <span class=\"menu-title\">Patients</span>\r\n");
      out.write("                <i class=\"menu-arrow\"></i>\r\n");
      out.write("                <i class=\"mdi mdi-heart menu-icon\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"collapse\" id=\"ui-patients\">\r\n");
      out.write("                <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/buttons.html\">All Patients</a></li>\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/typography.html\">Add</a></li>\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/typography.html\">Trash</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" data-bs-toggle=\"collapse\" href=\"#ui-profile\" aria-expanded=\"false\" aria-controls=\"ui-profile\">\r\n");
      out.write("                <span class=\"menu-title\">Profile</span>\r\n");
      out.write("                <i class=\"menu-arrow\"></i>\r\n");
      out.write("                <i class=\"mdi mdi-account-circle menu-icon\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"collapse\" id=\"ui-profile\">\r\n");
      out.write("                <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/buttons.html\">Show Profile</a></li>\r\n");
      out.write("                  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/typography.html\">Change Password</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
