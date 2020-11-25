package special_Exemples;

public class Employees {

        private  String employee_First_Name;
        private  String middle_Initial;
        private  String last_name;
        private  double hours_worked;
        private  double rate_Hour;
        private  double employee_net_Pay;
        private  double employee_gross;

    public double getEmployee_net_Pay() {
        return employee_net_Pay;
    }

    public void setEmployee_net_Pay(double employee_net_Pay) {
        this.employee_net_Pay = employee_net_Pay;
    }

    public double getEmployee_gross() {
        return employee_gross;
    }

    public void setEmployee_gross(double employee_gross) {
        this.employee_gross = employee_gross;
    }

        public Employees() {
        }

        public Employees(String employee_First_Name, String middle_Initial, String last_name, double hours_worked, double rate_Hour,double employee_gross,double employee_net_Pay) {
            this.employee_First_Name = employee_First_Name;
            this.middle_Initial = middle_Initial;
            this.last_name = last_name;
            this.hours_worked = hours_worked;
            this.rate_Hour = rate_Hour;
            this.employee_gross = employee_gross;
            this.employee_net_Pay = employee_net_Pay;
        }

        public String getEmployee_First_Name() {
            return employee_First_Name;
        }

        public void setEmployee_First_Name(String employee_First_Name) {
            this.employee_First_Name = employee_First_Name;
        }

        public String getMiddle_Initial() {
            return middle_Initial;
        }

        public void setMiddle_Initial(String middle_Initial) {
            this.middle_Initial = middle_Initial;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public double getHours_worked() {
            return hours_worked;
        }

        public void setHours_worked(double hours_worked) {
            this.hours_worked = hours_worked;
        }

        public double getRate_Hour() {
            return rate_Hour;
        }

        public void setRate_Hour(double rate_Hour) {
            this.rate_Hour = rate_Hour;
        }

    }

