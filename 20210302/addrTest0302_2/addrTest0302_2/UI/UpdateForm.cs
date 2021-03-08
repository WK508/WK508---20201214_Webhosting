using _20210223.Control;
using MaterialSkin.Controls;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace addrTest0302_2.UI
{
    public partial class UpdateForm : MaterialForm
    {
        public UpdateForm()
        {
            InitializeComponent();
        }

        private void uiSymbolButton1_Click(object sender, EventArgs e)
        {
            if (listView1.SelectedIndices.Count == 0)
            {
                MessageBox.Show("수정할 것을 선택해주세요.");
                return;
            }

            string list_count = string.Empty;
            string list_name = string.Empty;
            string list_tel = string.Empty;
            string list_address = string.Empty;
            string list_email = string.Empty;

            listView1.SelectedItems[0].SubItems[0].Text = string.Empty;
            listView1.SelectedItems[0].SubItems[1].Text = string.Empty;
            listView1.SelectedItems[0].SubItems[2].Text = string.Empty;
            listView1.SelectedItems[0].SubItems[3].Text = string.Empty;
            listView1.SelectedItems[0].SubItems[4].Text = string.Empty;
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (listView1.SelectedIndices.Count == 0)
            {
                return;
            }

            string list_count = listView1.SelectedItems[0].SubItems[0].Text;
            string list_name = listView1.SelectedItems[0].SubItems[1].Text;
            string list_tel = listView1.SelectedItems[0].SubItems[2].Text;
            string list_address = listView1.SelectedItems[0].SubItems[3].Text;
            string list_email = listView1.SelectedItems[0].SubItems[4].Text;
        }



        private void uiSymbolButton2_Click(object sender, EventArgs e)
        {
            
        }

        
        }
    }

