
namespace addrTest20210303.UI
{
    partial class ViewForm
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle10 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle11 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle12 = new System.Windows.Forms.DataGridViewCellStyle();
            this.listView1 = new System.Windows.Forms.ListView();
            this.Team_Name = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Team_Year1 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Team_Year2 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Team_Division = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.gridview = new Sunny.UI.UIDataGridView();
            this.Team_nm = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Team_y1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Team_y2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Team_div = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.viewExit = new Sunny.UI.UISymbolButton();
            ((System.ComponentModel.ISupportInitialize)(this.gridview)).BeginInit();
            this.SuspendLayout();
            // 
            // listView1
            // 
            this.listView1.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.Team_Name,
            this.Team_Year1,
            this.Team_Year2,
            this.Team_Division});
            this.listView1.FullRowSelect = true;
            this.listView1.HoverSelection = true;
            this.listView1.Location = new System.Drawing.Point(28, 149);
            this.listView1.Name = "listView1";
            this.listView1.Size = new System.Drawing.Size(861, 79);
            this.listView1.TabIndex = 0;
            this.listView1.UseCompatibleStateImageBehavior = false;
            this.listView1.View = System.Windows.Forms.View.Details;
            // 
            // Team_Name
            // 
            this.Team_Name.Text = "팀명";
            this.Team_Name.Width = 150;
            // 
            // Team_Year1
            // 
            this.Team_Year1.Text = "창단년도";
            this.Team_Year1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.Team_Year1.Width = 80;
            // 
            // Team_Year2
            // 
            this.Team_Year2.Text = "우승년도";
            this.Team_Year2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.Team_Year2.Width = 300;
            // 
            // Team_Division
            // 
            this.Team_Division.Text = "소속 리그/지구/순위";
            this.Team_Division.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.Team_Division.Width = 230;
            // 
            // gridview
            // 
            dataGridViewCellStyle10.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(235)))), ((int)(((byte)(243)))), ((int)(((byte)(255)))));
            this.gridview.AlternatingRowsDefaultCellStyle = dataGridViewCellStyle10;
            this.gridview.BackgroundColor = System.Drawing.Color.White;
            this.gridview.ColumnHeadersBorderStyle = System.Windows.Forms.DataGridViewHeaderBorderStyle.Single;
            dataGridViewCellStyle11.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle11.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(80)))), ((int)(((byte)(160)))), ((int)(((byte)(255)))));
            dataGridViewCellStyle11.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            dataGridViewCellStyle11.ForeColor = System.Drawing.Color.White;
            dataGridViewCellStyle11.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle11.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle11.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.gridview.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle11;
            this.gridview.ColumnHeadersHeight = 32;
            this.gridview.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.DisableResizing;
            this.gridview.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Team_nm,
            this.Team_y1,
            this.Team_y2,
            this.Team_div});
            this.gridview.EnableHeadersVisualStyles = false;
            this.gridview.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.gridview.GridColor = System.Drawing.Color.FromArgb(((int)(((byte)(80)))), ((int)(((byte)(160)))), ((int)(((byte)(255)))));
            this.gridview.Location = new System.Drawing.Point(28, 234);
            this.gridview.Name = "gridview";
            dataGridViewCellStyle12.BackColor = System.Drawing.Color.White;
            this.gridview.RowsDefaultCellStyle = dataGridViewCellStyle12;
            this.gridview.RowTemplate.Height = 29;
            this.gridview.SelectedIndex = -1;
            this.gridview.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.gridview.ShowGridLine = true;
            this.gridview.Size = new System.Drawing.Size(861, 145);
            this.gridview.TabIndex = 1;
            // 
            // Team_nm
            // 
            this.Team_nm.HeaderText = "팀명";
            this.Team_nm.Name = "Team_nm";
            this.Team_nm.Width = 120;
            // 
            // Team_y1
            // 
            this.Team_y1.HeaderText = "창단년도";
            this.Team_y1.Name = "Team_y1";
            // 
            // Team_y2
            // 
            this.Team_y2.HeaderText = "우승년도";
            this.Team_y2.Name = "Team_y2";
            this.Team_y2.Width = 300;
            // 
            // Team_div
            // 
            this.Team_div.HeaderText = "소속 리그/지구/순위";
            this.Team_div.Name = "Team_div";
            this.Team_div.Width = 300;
            // 
            // viewExit
            // 
            this.viewExit.BackColor = System.Drawing.Color.Transparent;
            this.viewExit.Cursor = System.Windows.Forms.Cursors.Hand;
            this.viewExit.FillColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.viewExit.Font = new System.Drawing.Font("Microsoft YaHei", 12F);
            this.viewExit.ForeColor = System.Drawing.Color.Cyan;
            this.viewExit.IsCircle = true;
            this.viewExit.Location = new System.Drawing.Point(812, 74);
            this.viewExit.MinimumSize = new System.Drawing.Size(1, 1);
            this.viewExit.Name = "viewExit";
            this.viewExit.Size = new System.Drawing.Size(77, 69);
            this.viewExit.Style = Sunny.UI.UIStyle.Custom;
            this.viewExit.Symbol = 61515;
            this.viewExit.TabIndex = 2;
            this.viewExit.Click += new System.EventHandler(this.viewExit_Click);
            // 
            // ViewForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(908, 487);
            this.Controls.Add(this.viewExit);
            this.Controls.Add(this.gridview);
            this.Controls.Add(this.listView1);
            this.Name = "ViewForm";
            this.Text = "World series 2020";
            this.Load += new System.EventHandler(this.ViewForm_Load);
            ((System.ComponentModel.ISupportInitialize)(this.gridview)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ListView listView1;
        private System.Windows.Forms.ColumnHeader Team_Name;
        private System.Windows.Forms.ColumnHeader Team_Year1;
        private System.Windows.Forms.ColumnHeader Team_Year2;
        private System.Windows.Forms.ColumnHeader Team_Division;
        private Sunny.UI.UIDataGridView gridview;
        private System.Windows.Forms.DataGridViewTextBoxColumn Team_nm;
        private System.Windows.Forms.DataGridViewTextBoxColumn Team_y1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Team_y2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Team_div;
        private Sunny.UI.UISymbolButton viewExit;
    }
}