package cl.programando.cursojavaee7.struts;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TestAction extends ActionSupport 
{
	
	private String name;
    private Date nowDate;

    @Override
    public void validate(){
        if (name==null || name.length()==0)
            addActionError(getText("error.enter.message"));
        
    }

    @Override
    public String execute() throws Exception {
        if (this.nowDate==null)
        	nowDate = new Date();
        
        return ActionSupport.SUCCESS;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNowDate() {
        return nowDate;
    }
}
