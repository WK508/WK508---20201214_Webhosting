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
    public partial class ViewForm : MaterialForm
    {
        public ViewForm()
        {
            InitializeComponent();

        }

        private void initListView()
        {
            string[] data = { "1", "시벨롬", "010-1111-1111", 
                              "대한민국 어딘가", "homme@naver.com" };
            listView.Items.Add(new ListViewItem(data));

            for (int i = 0; i < 10; i++)
            {
                listView.Items.Add(new ListViewItem(
                    new string[]
                    {
                        (i+2).ToString(), "시벨롬", "010-1111-1111",
                        "대한민국 어딘가", "homme@naver.com"
                    }
                    ));
            }

            setRowColor(listView, Color.DarkGray, Color.Green);
            int index = listView.Items.Count - 1;
            listView.Items[index].Selected = true;
            listView.Items[index].Focused = true;
            listView.EnsureVisible(index);
        }

        private void setRowColor(ListView list, Color color1, Color color2)
        {
            foreach (ListViewItem item in list.Items)
            {
                if ((item.Index % 2) == 0)
                {
                    item.BackColor = color1;
                }
                else
                {
                    item.BackColor = color2;
                }
            }
        }

        private void ViewForm_Load(object sender, EventArgs e)
        {
            initListView();
            initGridView();
        }

        private void initGridView()

        {
            string[] data = { "1", "시벨롬", "010-1111-1111", 
                              "대한민국 어딘가", "homme@naver.com" };
            GridView.Rows.Add(data);

            for (int i = 0; i < 10; i++)
            {
                GridView.Rows.Add(new string[]
                    {
                        (i+2).ToString(), "시벨롬", "010-1111-1111",
                        "대한민국 어딘가", "homme@naver.com"
                    }
                    );
            }
            int count = GridView.Rows.Count - 1;
            GridView.FirstDisplayedScrollingRowIndex =
                count;
            GridView.CurrentCell =
                GridView.Rows[count - 1].Cells[0];
        }

        private void viewExit_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void listView_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
