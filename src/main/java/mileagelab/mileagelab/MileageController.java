package mileagelab.mileagelab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {

	@RequestMapping("/")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}

	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int result = num1 * num2;

		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}
}