/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.sms;

/**
 *
 * @author PoYeS
 */
public class CourseWindow extends javax.swing.JPanel {

    /**
     * Creates new form CourseWindow
     */
    public CourseWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        courseIDTxt = new java.awt.TextField();
        courseFacultyTxt = new java.awt.TextField();
        courseNameTxt = new java.awt.TextField();
        courseDescriptionTextArea = new java.awt.TextArea();
        editCourseBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        courseFeesTxt = new java.awt.TextField();
        courseAdmissionDateTxt = new java.awt.TextField();
        studentsUnderTxt = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        qualificationCombobox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(153, 0, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Course"));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/sms/9197801-a-shot-of-an-asian-student-getting-books-in-a-library111.jpg"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Course ID");
        jLabel3.setMaximumSize(new java.awt.Dimension(250, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(250, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Course Faculty");
        jLabel4.setMaximumSize(new java.awt.Dimension(250, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(250, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Course Name");
        jLabel5.setMaximumSize(new java.awt.Dimension(250, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(250, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Required Qualification");
        jLabel6.setMaximumSize(new java.awt.Dimension(250, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(250, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Course Fees");
        jLabel7.setMaximumSize(new java.awt.Dimension(250, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(250, 25));
        jLabel7.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Course Admission Date");
        jLabel8.setMaximumSize(new java.awt.Dimension(250, 25));
        jLabel8.setMinimumSize(new java.awt.Dimension(250, 25));
        jLabel8.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel9.setBackground(new java.awt.Color(153, 153, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Students Under");
        jLabel9.setMaximumSize(new java.awt.Dimension(250, 25));
        jLabel9.setMinimumSize(new java.awt.Dimension(250, 25));
        jLabel9.setPreferredSize(new java.awt.Dimension(250, 25));

        courseIDTxt.setBackground(new java.awt.Color(152, 152, 226));
        courseIDTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        courseIDTxt.setMaximumSize(new java.awt.Dimension(250, 25));
        courseIDTxt.setMinimumSize(new java.awt.Dimension(250, 25));

        courseFacultyTxt.setBackground(new java.awt.Color(152, 152, 226));
        courseFacultyTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        courseFacultyTxt.setMaximumSize(new java.awt.Dimension(250, 25));
        courseFacultyTxt.setMinimumSize(new java.awt.Dimension(250, 25));

        courseNameTxt.setBackground(new java.awt.Color(152, 152, 226));
        courseNameTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        courseNameTxt.setMaximumSize(new java.awt.Dimension(250, 25));
        courseNameTxt.setMinimumSize(new java.awt.Dimension(250, 25));

        courseDescriptionTextArea.setBackground(new java.awt.Color(152, 152, 226));
        courseDescriptionTextArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        courseDescriptionTextArea.setMaximumSize(new java.awt.Dimension(250, 25));
        courseDescriptionTextArea.setMinimumSize(new java.awt.Dimension(250, 25));

        editCourseBtn.setBackground(new java.awt.Color(255, 153, 255));
        editCourseBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editCourseBtn.setForeground(new java.awt.Color(0, 102, 102));
        editCourseBtn.setText("Edit Course");
        editCourseBtn.setToolTipText("");
        editCourseBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editCourseBtn.setMaximumSize(new java.awt.Dimension(70, 25));
        editCourseBtn.setMinimumSize(new java.awt.Dimension(70, 25));
        editCourseBtn.setPreferredSize(new java.awt.Dimension(70, 25));

        submitBtn.setBackground(new java.awt.Color(255, 153, 255));
        submitBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(0, 102, 102));
        submitBtn.setText("Submit");
        submitBtn.setToolTipText("");
        submitBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        submitBtn.setMaximumSize(new java.awt.Dimension(70, 25));
        submitBtn.setMinimumSize(new java.awt.Dimension(70, 25));
        submitBtn.setPreferredSize(new java.awt.Dimension(70, 25));

        cancelBtn.setBackground(new java.awt.Color(255, 153, 255));
        cancelBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(0, 102, 102));
        cancelBtn.setText("Cancel");
        cancelBtn.setToolTipText("");
        cancelBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelBtn.setMaximumSize(new java.awt.Dimension(70, 25));
        cancelBtn.setMinimumSize(new java.awt.Dimension(70, 25));
        cancelBtn.setPreferredSize(new java.awt.Dimension(70, 25));

        courseFeesTxt.setBackground(new java.awt.Color(152, 152, 226));
        courseFeesTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        courseFeesTxt.setMaximumSize(new java.awt.Dimension(250, 25));
        courseFeesTxt.setMinimumSize(new java.awt.Dimension(250, 25));

        courseAdmissionDateTxt.setBackground(new java.awt.Color(152, 152, 226));
        courseAdmissionDateTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        courseAdmissionDateTxt.setMaximumSize(new java.awt.Dimension(250, 25));
        courseAdmissionDateTxt.setMinimumSize(new java.awt.Dimension(250, 25));

        studentsUnderTxt.setBackground(new java.awt.Color(152, 152, 226));
        studentsUnderTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        studentsUnderTxt.setMaximumSize(new java.awt.Dimension(250, 25));
        studentsUnderTxt.setMinimumSize(new java.awt.Dimension(250, 25));

        jLabel10.setBackground(new java.awt.Color(153, 153, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Course Description");
        jLabel10.setMaximumSize(new java.awt.Dimension(250, 25));
        jLabel10.setMinimumSize(new java.awt.Dimension(250, 25));
        jLabel10.setPreferredSize(new java.awt.Dimension(250, 25));

        qualificationCombobox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        qualificationCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Graduation", "Post Graduation", "MCA", "MBA", "B.Tech", "M.Tech" }));
        qualificationCombobox.setMaximumSize(new java.awt.Dimension(250, 25));
        qualificationCombobox.setMinimumSize(new java.awt.Dimension(250, 25));
        qualificationCombobox.setPreferredSize(new java.awt.Dimension(250, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(editCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(studentsUnderTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseAdmissionDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseNameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseFacultyTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseIDTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseFeesTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qualificationCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseDescriptionTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseIDTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseFacultyTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qualificationCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseFeesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseAdmissionDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsUnderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(courseDescriptionTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private java.awt.TextField courseAdmissionDateTxt;
    private java.awt.TextArea courseDescriptionTextArea;
    private java.awt.TextField courseFacultyTxt;
    private java.awt.TextField courseFeesTxt;
    private java.awt.TextField courseIDTxt;
    private java.awt.TextField courseNameTxt;
    private javax.swing.JButton editCourseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox qualificationCombobox;
    private java.awt.TextField studentsUnderTxt;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
