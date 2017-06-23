package cn.com.rscala.springmvc.view.viewresolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

public class PdfViewResolver implements ViewResolver{

	public View resolveViewName(String viewName, Locale locale) throws Exception {
		PdfView view = new PdfView();
		return view;
      }
	
}