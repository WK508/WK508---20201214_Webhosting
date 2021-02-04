using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _210204
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = "LAD";
            textBox1.Text = "LA DODGERS";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            label1.Text = "TB";
            textBox1.Text = "TAMPA BAY RAYS";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            label1.Text = "ATL";
            textBox1.Text = "ATLANTA BRAVES";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            label1.Text = "HOU";
            textBox1.Text = "HOSTON ASTROS";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            label1.Text = "SD";
            textBox1.Text = "SAN DIEGO PADRES";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            label1.Text = "OAK";
            textBox1.Text = "OAKLAND ATHLESTICS";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            label1.Text = "NYY";
            textBox1.Text = "NEW YORK YANKEES";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            label1.Text = "MIA";
            textBox1.Text = "MIAMI MARLINS";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            label1.Text = "CLE";
            textBox1.Text = "CLEVELAND INDIANS";
        }

        private void button10_Click(object sender, EventArgs e)
        {
            label1.Text = "CHC";
            textBox1.Text = "CHICAGO CUBS";
        }
    }
}
