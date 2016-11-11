public void SetConnectAdmin(String pass, String log) {
        try {
            
            g = "DOGED";
            stmt = con.createStatement();
            String SQL = "SELECT * FROM USERS WHERE NAME='"+log+"' and PASS='"+pass+"';";
            System.out.println(SQL);
            rs = stmt.executeQuery(SQL);
            
            rs.next();
            System.out.println(rs.getString("NAME"));
            String  name = rs.getString("NAME");
            String password = rs.getString("PASS");
//            rs.next();
            
            
            int count = 0;
            while(rs.next()){
                count++;
            }
            if(count==1){
                g = "DOGED";
                logged = true;
            }
                
            
            if(count>1){
                logged = false;
                g = "DUPLIACTE";
            }
                
            
            

            
//            jTextField1.setText(first_name);
//            jTextField2.setText(last_name);
        } catch (SQLException err) {
            //JOptionPane.showMessageDialog(MainMe, err.getMessage());
//            jTextField1.setText("ERROR");
        }
    }