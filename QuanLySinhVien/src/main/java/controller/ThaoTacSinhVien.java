package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bo.XemDanhSachSinhVienBO;
import modle.bean.SinhVien;

@WebServlet("/ThaoTacSinhVien")
public class ThaoTacSinhVien extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	protected void doGet 
		(HttpServletRequest request, 
		HttpServletResponse reponse) throws ServletException,
		IOException {
			doPost(request, reponse);
		}
	
	protected void doPost 
		(HttpServletRequest request, 
		HttpServletResponse reponse) throws ServletException,
		IOException {
			String destination = null;
			XemDanhSachSinhVienBO xemDanhSachSinhVienBO = new XemDanhSachSinhVienBO();
			ArrayList<SinhVien> sinhVienArray = null;
			
			sinhVienArray = xemDanhSachSinhVienBO.getAllSinhVien();
			request.setAttribute("sinhVienArray", sinhVienArray);
			destination ="/XemThongTinSinhVien.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, reponse);
		}
}
