
namespace addrTest0302_2.UI
{
    partial class UpdateForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle3 = new System.Windows.Forms.DataGridViewCellStyle();
            this.listView1 = new System.Windows.Forms.ListView();
            this.list_count = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.list_name = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.list_tel = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.list_address = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.list_email = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.GridView1 = new Sunny.UI.UIDataGridView();
            this.list_number = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.list_nm = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.list_phone = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.list_addr = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.list_mail = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.uiSymbolButton1 = new Sunny.UI.UISymbolButton();
            ((System.ComponentModel.ISupportInitialize)(this.GridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // listView1
            // 
            this.listView1.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.list_count,
            this.list_name,
            this.list_tel,
            this.list_address,
            this.list_email});
            this.listView1.HideSelection = false;
            this.listView1.Location = new System.Drawing.Point(47, 118);
            this.listView1.Name = "listView1";
            this.listView1.Size = new System.Drawing.Size(706, 164);
            this.listView1.TabIndex = 0;
            this.listView1.UseCompatibleStateImageBehavior = false;
            this.listView1.View = System.Windows.Forms.View.Details;
            this.listView1.SelectedIndexChanged += new System.EventHandler(this.listView1_SelectedIndexChanged);
            // 
            // list_count
            // 
            this.list_count.Text = "번호";
            // 
            // list_name
            // 
            this.list_name.Text = "이름";
            // 
            // list_tel
            // 
            this.list_tel.Text = "전화번호";
            this.list_tel.Width = 150;
            // 
            // list_address
            // 
            this.list_address.Text = "주소";
            this.list_address.Width = 150;
            // 
            // list_email
            // 
            this.list_email.Text = "이메일";
            this.list_email.Width = 150;
            // 
            // GridView1
            // 
            dataGridViewCellStyle1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(235)))), ((int)(((byte)(243)))), ((int)(((byte)(255)))));
            this.GridView1.AlternatingRowsDefaultCellStyle = dataGridViewCellStyle1;
            this.GridView1.BackgroundColor = System.Drawing.Color.White;
            this.GridView1.ColumnHeadersBorderStyle = System.Windows.Forms.DataGridViewHeaderBorderStyle.Single;
            dataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(80)))), ((int)(((byte)(160)))), ((int)(((byte)(255)))));
            dataGridViewCellStyle2.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            dataGridViewCellStyle2.ForeColor = System.Drawing.Color.White;
            dataGridViewCellStyle2.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle2.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.GridView1.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle2;
            this.GridView1.ColumnHeadersHeight = 32;
            this.GridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.DisableResizing;
            this.GridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.list_number,
            this.list_nm,
            this.list_phone,
            this.list_addr,
            this.list_mail});
            this.GridView1.EnableHeadersVisualStyles = false;
            this.GridView1.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.GridView1.GridColor = System.Drawing.Color.FromArgb(((int)(((byte)(80)))), ((int)(((byte)(160)))), ((int)(((byte)(255)))));
            this.GridView1.Location = new System.Drawing.Point(47, 288);
            this.GridView1.Name = "GridView1";
            dataGridViewCellStyle3.BackColor = System.Drawing.Color.White;
            this.GridView1.RowsDefaultCellStyle = dataGridViewCellStyle3;
            this.GridView1.RowTemplate.Height = 29;
            this.GridView1.SelectedIndex = -1;
            this.GridView1.ShowGridLine = true;
            this.GridView1.Size = new System.Drawing.Size(706, 140);
            this.GridView1.TabIndex = 1;
            // 
            // list_number
            // 
            this.list_number.HeaderText = "번호";
            this.list_number.Name = "list_number";
            // 
            // list_nm
            // 
            this.list_nm.HeaderText = "이름";
            this.list_nm.Name = "list_nm";
            // 
            // list_phone
            // 
            this.list_phone.HeaderText = "전화번호";
            this.list_phone.Name = "list_phone";
            this.list_phone.Width = 150;
            // 
            // list_addr
            // 
            this.list_addr.HeaderText = "주소";
            this.list_addr.Name = "list_addr";
            this.list_addr.Width = 150;
            // 
            // list_mail
            // 
            this.list_mail.HeaderText = "이메일";
            this.list_mail.Name = "list_mail";
            this.list_mail.Width = 150;
            // 
            // uiSymbolButton1
            // 
            this.uiSymbolButton1.BackColor = System.Drawing.Color.Transparent;
            this.uiSymbolButton1.Cursor = System.Windows.Forms.Cursors.Hand;
            this.uiSymbolButton1.FillColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.uiSymbolButton1.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolButton1.IsCircle = true;
            this.uiSymbolButton1.Location = new System.Drawing.Point(700, 77);
            this.uiSymbolButton1.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolButton1.Name = "uiSymbolButton1";
            this.uiSymbolButton1.Size = new System.Drawing.Size(53, 35);
            this.uiSymbolButton1.Style = Sunny.UI.UIStyle.Custom;
            this.uiSymbolButton1.Symbol = 61694;
            this.uiSymbolButton1.TabIndex = 2;
            this.uiSymbolButton1.Click += new System.EventHandler(this.uiSymbolButton1_Click);
            // 
            // UpdateForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.uiSymbolButton1);
            this.Controls.Add(this.GridView1);
            this.Controls.Add(this.listView1);
            this.Name = "UpdateForm";
            this.Text = "주소록 데이터 수정, 삭제";
            ((System.ComponentModel.ISupportInitialize)(this.GridView1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ListView listView1;
        private Sunny.UI.UIDataGridView GridView1;
        private System.Windows.Forms.ColumnHeader list_count;
        private System.Windows.Forms.ColumnHeader list_name;
        private System.Windows.Forms.ColumnHeader list_tel;
        private System.Windows.Forms.ColumnHeader list_address;
        private System.Windows.Forms.ColumnHeader list_email;
        private System.Windows.Forms.DataGridViewTextBoxColumn list_number;
        private System.Windows.Forms.DataGridViewTextBoxColumn list_nm;
        private System.Windows.Forms.DataGridViewTextBoxColumn list_phone;
        private System.Windows.Forms.DataGridViewTextBoxColumn list_addr;
        private System.Windows.Forms.DataGridViewTextBoxColumn list_mail;
        private Sunny.UI.UISymbolButton uiSymbolButton1;
    }
}