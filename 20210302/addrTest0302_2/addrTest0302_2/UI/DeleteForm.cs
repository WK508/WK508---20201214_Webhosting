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
    public partial class DeleteForm : MaterialForm
    {
        public DeleteForm()
        {
            InitializeComponent();
        }

        private void uiSymbolButton1_Click(object sender, EventArgs e)
        {
            if (listView1.SelectedIndices.Count == 0)
            {
                MessageBox.Show("삭제할 것을 선택해주세요.");
                return;
            }
            listView1.Items.RemoveAt(0);
        }
    }
}

        
