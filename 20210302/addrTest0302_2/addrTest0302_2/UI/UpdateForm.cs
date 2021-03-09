using _20210223.Control;
using _20210223.Model;
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
    partial class UpdateForm : MaterialForm
    {
        StudentCtrl sc;
        public UpdateForm()
        {
            InitializeComponent();
        }

        
        public UpdateForm(StudentCtrl sc)
        {
            InitializeComponent();
            this.sc = sc;
        }



        private void showList()
        {
            int cnt = sc.getList().Count;
            for (int i = 0; i < cnt; i++)
            {
                List<Student> addrList = sc.getList();
                UpList.Items.Add(new ListViewItem(
                    new string[]
                    {
                            (i + 1).ToString(),
                            addrList[i].Name,
                            addrList[i].Tel,
                            addrList[i].Address,
                            addrList[i].Email
                    }
              ));
            }

            setRowColor(UpList, Color.DarkGray, Color.Green);
            int index = UpList.Items.Count - 1;
            // listView.Items[index].Selected = true;
            UpList.Items[index].Focused = true;
            UpList.EnsureVisible(index);
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

        private void UpdateForm_Load(object sender, EventArgs e)
        {
            showList();
        }

        private void UpList_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (UpList.SelectedItems.Count != 0)
            {
                int n = UpList.SelectedItems[0].Index;
                string name = UpList.Items[n].SubItems[1].Text;
                string tel = UpList.Items[n].SubItems[2].Text;
                string address = UpList.Items[n].SubItems[3].Text;
                string email = UpList.Items[n].SubItems[4].Text;
                Console.WriteLine("이름 : {0}", name);
                Console.WriteLine("전화 : {0}", tel);
                Console.WriteLine("주소 : {0}", address);
                Console.WriteLine("메일 : {0}", email);
                Console.WriteLine("-------------------------------------");
                UpName.Text = name;
                UpTel.Text = tel;
                UpAddress.Text = address;
                UpEmail.Text = email;
            }
        }
    }
}
