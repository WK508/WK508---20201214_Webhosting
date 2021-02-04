using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _20210204
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (checkBox1.Checked == true)
            {
                label1.Text = textBox1.Text;
                listBox1.Items.Add(textBox1.Text);
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            listBox1.Items.Add("LA 다저스");
            listBox1.Items.Add("탬파베이 레이스");
            listBox1.Items.Add("애틀란타 브레이브스");
            listBox1.Items.Add("휴스턴 애스트로스");
            listBox1.Items.Add("샌디에이고 파드리스");
            listBox1.Items.Add("오클랜드 어슬레틱스");
            listBox1.Items.Add("뉴욕 양키스");
            listBox1.Items.Add("마이애미 말린스");
            listBox1.Items.Add("클리블랜드 인디언스");
            listBox1.Items.Add("시카고 컵스");
            listBox1.Items.Add("미네소타 트윈스");
            listBox1.Items.Add("시카고 화이트삭스");
            listBox1.Items.Add("토론토 블루제이스");
            listBox1.Items.Add("신시내티 레즈");
            listBox1.Items.Add("세인트루이스 카디널스");
            listBox1.Items.Add("밀워키 브루어스");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (listBox1.SelectedIndex == -1)
            {
                MessageBox.Show("목록에 선택된 내용이 없습니다.");
            }else
            {
                listBox1.Items.RemoveAt(listBox1.SelectedIndex);
            }
        }
    }
}
