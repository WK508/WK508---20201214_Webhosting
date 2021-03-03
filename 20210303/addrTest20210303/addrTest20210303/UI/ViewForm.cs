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

namespace addrTest20210303.UI
{
    public partial class ViewForm : MaterialForm
    {
        public ViewForm()
        {
            InitializeComponent();
        }

        private void initListView()
        {
            string[] data = { "LA 다저스", "1884", 
                "1955, 1959, 1963, 1965, 1981, 1988, 2020", 
                "내셔널리그 서부지구 1위" };
            listView1.Items.Add(new ListViewItem(data));

            for (int i = 0; i < 4; i++)
            {
                listView1.Items.Add(new ListViewItem(
                    new string[]
                    {
                        "LA 다저스", "1884", 
                        "1955, 1959, 1963, 1965, 1981, 1988, 2020", 
                        "내셔널리그 서부지구 1위"
                    }
                    ));
            }

            setRowColor(listView1, Color.Blue, Color.LightBlue);
            int index = listView1.Items.Count - 1;
            listView1.Items[index].Selected = true;
            listView1.Items[index].Focused = true;
            listView1.EnsureVisible(index);

            }

        private void setRowColor(ListView listView1, Color color1, Color color2)
        {
            foreach (ListViewItem item in listView1.Items)
            {
                if ((item.Index % 2 == 0))
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
            initgridview();
        }

        private void initgridview()
        {
            string[] data = { "LA 다저스", "1884", 
                "1955, 1959, 1963, 1965, 1981, 1988, 2020", 
                "내셔널리그 서부지구 1위" };
            gridview.Rows.Add(data);

            for (int i = 0; i < 4; i++)
            {
                gridview.Rows.Add(new string[]
                {
                    "LA 다저스", "1884",
                    "1955, 1959, 1963, 1965, 1981, 1988, 2020", 
                    "내셔널리그 서부지구 1위"
                }
                );
            }
            int count = gridview.Rows.Count - 1;
            gridview.FirstDisplayedScrollingRowIndex =
                count;
            gridview.CurrentCell =
                gridview.Rows[count - 1].Cells[0];
        }

        private void viewExit_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
    }
    


