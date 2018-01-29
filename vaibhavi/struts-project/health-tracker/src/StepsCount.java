
 import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class StepsCount extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String steps;
	private int totalSteps;

	public String getSteps() {
		return steps;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public int getTotalSteps() {
		return totalSteps;
	}

	@Override
	public void validate() {
		if (steps == null)
			totalSteps = 0;
		if (StringUtils.isEmpty(steps))
			this.addFieldError("steps", "Enter Steps");
	}

	@Override
	public String execute() {
		totalSteps += Integer.parseInt(steps);
		return INPUT;
	}
}



