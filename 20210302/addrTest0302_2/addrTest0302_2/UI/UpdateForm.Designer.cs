
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
            this.UpList = new System.Windows.Forms.ListView();
            this.list_count = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.list_name = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.list_tel = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.list_address = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.list_email = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.UpCancel = new Sunny.UI.UISymbolButton();
            this.UpOk = new Sunny.UI.UISymbolButton();
            this.UpEmail = new Sunny.UI.UITextBox();
            this.uiSymbolLabel4 = new Sunny.UI.UISymbolLabel();
            this.UpAddress = new Sunny.UI.UITextBox();
            this.uiSymbolLabel3 = new Sunny.UI.UISymbolLabel();
            this.UpTel = new Sunny.UI.UITextBox();
            this.uiSymbolLabel2 = new Sunny.UI.UISymbolLabel();
            this.UpName = new Sunny.UI.UITextBox();
            this.uiSymbolLabel5 = new Sunny.UI.UISymbolLabel();
            this.SuspendLayout();
            // 
            // UpList
            // 
            this.UpList.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.list_count,
            this.list_name,
            this.list_tel,
            this.list_address,
            this.list_email});
            this.UpList.FullRowSelect = true;
            this.UpList.HideSelection = false;
            this.UpList.Location = new System.Drawing.Point(40, 116);
            this.UpList.Name = "UpList";
            this.UpList.Size = new System.Drawing.Size(706, 164);
            this.UpList.TabIndex = 1;
            this.UpList.UseCompatibleStateImageBehavior = false;
            this.UpList.View = System.Windows.Forms.View.Details;
            this.UpList.SelectedIndexChanged += new System.EventHandler(this.UpList_SelectedIndexChanged);
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
            // UpCancel
            // 
            this.UpCancel.BackColor = System.Drawing.Color.Transparent;
            this.UpCancel.Cursor = System.Windows.Forms.Cursors.Hand;
            this.UpCancel.FillColor = System.Drawing.Color.Red;
            this.UpCancel.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.UpCancel.IsCircle = true;
            this.UpCancel.Location = new System.Drawing.Point(414, 541);
            this.UpCancel.MinimumSize = new System.Drawing.Size(1, 1);
            this.UpCancel.Name = "UpCancel";
            this.UpCancel.RectColor = System.Drawing.Color.Red;
            this.UpCancel.Size = new System.Drawing.Size(50, 50);
            this.UpCancel.Style = Sunny.UI.UIStyle.Custom;
            this.UpCancel.Symbol = 61453;
            this.UpCancel.TabIndex = 19;
            // 
            // UpOk
            // 
            this.UpOk.BackColor = System.Drawing.Color.Transparent;
            this.UpOk.Cursor = System.Windows.Forms.Cursors.Hand;
            this.UpOk.FillColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.UpOk.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.UpOk.IsCircle = true;
            this.UpOk.Location = new System.Drawing.Point(259, 541);
            this.UpOk.MinimumSize = new System.Drawing.Size(1, 1);
            this.UpOk.Name = "UpOk";
            this.UpOk.RectColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.UpOk.Size = new System.Drawing.Size(50, 50);
            this.UpOk.Style = Sunny.UI.UIStyle.Custom;
            this.UpOk.TabIndex = 18;
            // 
            // UpEmail
            // 
            this.UpEmail.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.UpEmail.FillColor = System.Drawing.Color.White;
            this.UpEmail.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.UpEmail.Location = new System.Drawing.Point(363, 479);
            this.UpEmail.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.UpEmail.Maximum = 2147483647D;
            this.UpEmail.Minimum = -2147483648D;
            this.UpEmail.MinimumSize = new System.Drawing.Size(1, 1);
            this.UpEmail.Name = "UpEmail";
            this.UpEmail.Padding = new System.Windows.Forms.Padding(5);
            this.UpEmail.Size = new System.Drawing.Size(183, 29);
            this.UpEmail.TabIndex = 17;
            // 
            // uiSymbolLabel4
            // 
            this.uiSymbolLabel4.BackColor = System.Drawing.Color.Transparent;
            this.uiSymbolLabel4.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel4.Location = new System.Drawing.Point(220, 479);
            this.uiSymbolLabel4.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel4.Name = "uiSymbolLabel4";
            this.uiSymbolLabel4.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel4.Size = new System.Drawing.Size(89, 35);
            this.uiSymbolLabel4.Symbol = 61946;
            this.uiSymbolLabel4.SymbolColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.uiSymbolLabel4.TabIndex = 16;
            this.uiSymbolLabel4.Text = "메일";
            // 
            // UpAddress
            // 
            this.UpAddress.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.UpAddress.FillColor = System.Drawing.Color.White;
            this.UpAddress.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.UpAddress.Location = new System.Drawing.Point(363, 422);
            this.UpAddress.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.UpAddress.Maximum = 2147483647D;
            this.UpAddress.Minimum = -2147483648D;
            this.UpAddress.MinimumSize = new System.Drawing.Size(1, 1);
            this.UpAddress.Name = "UpAddress";
            this.UpAddress.Padding = new System.Windows.Forms.Padding(5);
            this.UpAddress.Size = new System.Drawing.Size(183, 29);
            this.UpAddress.TabIndex = 15;
            // 
            // uiSymbolLabel3
            // 
            this.uiSymbolLabel3.BackColor = System.Drawing.Color.Transparent;
            this.uiSymbolLabel3.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel3.Location = new System.Drawing.Point(220, 422);
            this.uiSymbolLabel3.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel3.Name = "uiSymbolLabel3";
            this.uiSymbolLabel3.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel3.Size = new System.Drawing.Size(89, 35);
            this.uiSymbolLabel3.Symbol = 57571;
            this.uiSymbolLabel3.SymbolColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.uiSymbolLabel3.TabIndex = 14;
            this.uiSymbolLabel3.Text = "주소";
            // 
            // UpTel
            // 
            this.UpTel.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.UpTel.FillColor = System.Drawing.Color.White;
            this.UpTel.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.UpTel.Location = new System.Drawing.Point(363, 368);
            this.UpTel.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.UpTel.Maximum = 2147483647D;
            this.UpTel.Minimum = -2147483648D;
            this.UpTel.MinimumSize = new System.Drawing.Size(1, 1);
            this.UpTel.Name = "UpTel";
            this.UpTel.Padding = new System.Windows.Forms.Padding(5);
            this.UpTel.Size = new System.Drawing.Size(183, 29);
            this.UpTel.TabIndex = 13;
            // 
            // uiSymbolLabel2
            // 
            this.uiSymbolLabel2.BackColor = System.Drawing.Color.Transparent;
            this.uiSymbolLabel2.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel2.Location = new System.Drawing.Point(220, 368);
            this.uiSymbolLabel2.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel2.Name = "uiSymbolLabel2";
            this.uiSymbolLabel2.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel2.Size = new System.Drawing.Size(89, 35);
            this.uiSymbolLabel2.Symbol = 57488;
            this.uiSymbolLabel2.SymbolColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.uiSymbolLabel2.TabIndex = 12;
            this.uiSymbolLabel2.Text = "전화";
            // 
            // UpName
            // 
            this.UpName.Cursor = System.Windows.Forms.Cursors.IBeam;
            this.UpName.FillColor = System.Drawing.Color.White;
            this.UpName.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.UpName.Location = new System.Drawing.Point(363, 313);
            this.UpName.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.UpName.Maximum = 2147483647D;
            this.UpName.Minimum = -2147483648D;
            this.UpName.MinimumSize = new System.Drawing.Size(1, 1);
            this.UpName.Name = "UpName";
            this.UpName.Padding = new System.Windows.Forms.Padding(5);
            this.UpName.Size = new System.Drawing.Size(183, 29);
            this.UpName.TabIndex = 11;
            // 
            // uiSymbolLabel5
            // 
            this.uiSymbolLabel5.BackColor = System.Drawing.Color.Transparent;
            this.uiSymbolLabel5.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.uiSymbolLabel5.Location = new System.Drawing.Point(220, 313);
            this.uiSymbolLabel5.MinimumSize = new System.Drawing.Size(1, 1);
            this.uiSymbolLabel5.Name = "uiSymbolLabel5";
            this.uiSymbolLabel5.Padding = new System.Windows.Forms.Padding(28, 0, 0, 0);
            this.uiSymbolLabel5.Size = new System.Drawing.Size(89, 35);
            this.uiSymbolLabel5.Symbol = 62144;
            this.uiSymbolLabel5.SymbolColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.uiSymbolLabel5.TabIndex = 10;
            this.uiSymbolLabel5.Text = "이름";
            // 
            // UpdateForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 643);
            this.Controls.Add(this.UpCancel);
            this.Controls.Add(this.UpOk);
            this.Controls.Add(this.UpEmail);
            this.Controls.Add(this.uiSymbolLabel4);
            this.Controls.Add(this.UpAddress);
            this.Controls.Add(this.uiSymbolLabel3);
            this.Controls.Add(this.UpTel);
            this.Controls.Add(this.uiSymbolLabel2);
            this.Controls.Add(this.UpName);
            this.Controls.Add(this.uiSymbolLabel5);
            this.Controls.Add(this.UpList);
            this.Name = "UpdateForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "UpdateForm";
            this.Load += new System.EventHandler(this.UpdateForm_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ListView UpList;
        private System.Windows.Forms.ColumnHeader list_count;
        private System.Windows.Forms.ColumnHeader list_name;
        private System.Windows.Forms.ColumnHeader list_tel;
        private System.Windows.Forms.ColumnHeader list_address;
        private System.Windows.Forms.ColumnHeader list_email;
        private Sunny.UI.UISymbolButton UpCancel;
        private Sunny.UI.UISymbolButton UpOk;
        private Sunny.UI.UITextBox UpEmail;
        private Sunny.UI.UISymbolLabel uiSymbolLabel4;
        private Sunny.UI.UITextBox UpAddress;
        private Sunny.UI.UISymbolLabel uiSymbolLabel3;
        private Sunny.UI.UITextBox UpTel;
        private Sunny.UI.UISymbolLabel uiSymbolLabel2;
        private Sunny.UI.UITextBox UpName;
        private Sunny.UI.UISymbolLabel uiSymbolLabel5;
    }
}